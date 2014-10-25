/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ite.rvc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Moo
 */
public class ConnectionManager {

    static Connection con;
    static String url;
    static String user;
    static String encoding;

    public static Connection getConnection() {

        try {
            url = "jdbc:mysql://127.0.0.1:3306/RVCDB";
            //user = "?user=webuser&password=12345678";
            user = "?user=root&password=";
            encoding = "&useUnicode=true&characterEncoding=UTF-8";
            Class.forName("com.mysql.jdbc.Driver");
            
            //con = DriverManager.getConnection(url, "webuser", "12345678");
            con = DriverManager.getConnection(url+user+encoding);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
        }
        return con;
    }
}
