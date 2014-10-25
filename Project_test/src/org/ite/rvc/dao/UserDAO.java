package org.ite.rvc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.ite.rvc.util.ConnectionManager;

public class UserDAO {
	 static Connection connection = null;
	    static ResultSet rs = null;
	    static PreparedStatement pst = null;
	    public static boolean isUsernameExist(String username){
	        boolean result = false;
	        try {
	            connection = ConnectionManager.getConnection();
	            pst = connection.prepareCall("SELECT * FROM user WHERE username=(?);");
	            pst.setString(1, username);
	            rs = pst.executeQuery();
	            if (rs.next()) {
	                result = true;
	            }
	        } catch (SQLException ex) {
	            System.out.println(ex);
	        } finally {
	            releaseResource();
	        }
	        return result;
	    }
	    private static void releaseResource() {
	        if (rs != null) {
	            try {
	                rs.close();
	            } catch (Exception e) {
	            }
	            rs = null;
	        }

	        if (pst != null) {
	            try {
	                pst.close();
	            } catch (Exception e) {
	            }
	            pst = null;
	        }

	        if (connection != null) {
	            try {
	                connection.close();
	            } catch (Exception e) {
	            }
	            connection = null;
	        }
	    }
}
