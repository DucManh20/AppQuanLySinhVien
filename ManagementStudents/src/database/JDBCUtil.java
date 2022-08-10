/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Dell
 */
public class JDBCUtil {
    public static Connection getConnection(){
        Connection connection = null;
        try{
            String url = "jdbc:mySQL://localhost:3306/students";
            String user = "root";
            String password = "";
            connection = DriverManager.getConnection(url, user, password);
        }catch(SQLException e){
        }
        return connection;
    }
    
    public static void closeConnection(Connection connection){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCUtil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
