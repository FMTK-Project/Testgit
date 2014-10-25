package org.ite.rvc.servlet.manageuser;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.ite.rvc.dao.UserDAO;
import org.ite.rvc.user.User;
import org.ite.rvc.util.ConnectionManager;

@WebServlet("/InsertUserServlet")
public class InsertUserServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	static Connection connection = null;
	static ResultSet rs = null;
	static PreparedStatement pst = null;
	public InsertUserServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("U");
		String password = request.getParameter("P");
		String firstname = request.getParameter("N");
		String lastname=request.getParameter("L");
		String gender=request.getParameter("optionsRadiosGender");
		String email=request.getParameter("E");
		String photo=request.getParameter("photo");
		String usertype=request.getParameter("usertype");
		InputStream inputStream = null; // input stream of the upload file
        
        // obtains the upload file part in this multipart request
        Part filePart = request.getPart("photo");
        if (filePart != null) {
            // prints out some information for debugging
            System.out.println(filePart.getName());
            System.out.println(filePart.getSize());
            System.out.println(filePart.getContentType());
             
            // obtains input stream of the upload file
            inputStream = filePart.getInputStream();
        }
        User user=new User();
		 
        if(UserDAO.isUsernameExist(username)){
            return;
        }
        if (!validatePassword(request.getParameter("password"), request.getParameter("repassword"))) {
            response.sendRedirect("error.jsp?errorCode=t004");
        }
		try {
			connection = ConnectionManager.getConnection();
			pst = connection.prepareCall("INSERT INTO TBL_USER (USERNAME,PASSWORD,F_NAME,L_NAME,GENDER,EMAIL,PHOTO,USERTYPE) VALUES (?,?,?,?,?,?,?,?,?);");
			
			pst.setString(1, username);
			pst.setString(2, password);
			pst.setString(3, firstname);
			pst.setString(4, lastname);
			pst.setString(5, gender);
			pst.setString(6, email);
			pst.setString(7, photo);
			pst.setString(8, usertype);
			
			
			
			int i = pst.executeUpdate();
			  
	            if (i != 0) {
	                user.setExecutionResult(true);
	            } else {
	                user.setExecutionResult(false);
	            }
			
		}catch (Exception e) {
			System.out.println("Log In failed: An Exception has occurred! " + e);
		}
	}
	 private boolean validatePassword(String pass1, String pass2) {
	        return pass1.equals(pass2);
	    }
}

