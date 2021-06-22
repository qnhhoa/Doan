/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author TienVinh
 */
public class ConnectionDB_DAL {
    public ConnectionDB_DAL(){};
//    private static String DB_URL = "jdbc:sqlserver://DESKTOP-5INI1CA\\LEO297;"
//            + "databaseName=testdb;"
//            + "integratedSecurity=true";
//    private static String USER_NAME = "sa";
//    private static String PASSWORD = "1234567890";ST4
    public static Connection conn;

    public static Connection OpenConnection(){
        try {
                    //Class.forName(com.microsoft.sqlserver.jdbc.SQLServerDriver);
                    String dbURL = "jdbc:sqlserver://DESKTOP-CNAUT3O\\SQLEXPRESS;databaseName=Hotel";
                    String user = "ssa";
                    String pass = "sa";
                    conn = DriverManager.getConnection(dbURL, user, pass);
         
            
                    System.out.println("Connect succesfull");
                    //return true;
 
        } catch (SQLException ex) {
            ex.printStackTrace();
            //return false;
        }
        return conn;
    }
    
    public boolean CloseConnection(){
        try{
            conn.close();
            return true;
        } catch (SQLException ex){
            ex.printStackTrace();
           System.out.println("disconnect fail");
           return false;
        }
    }
}
    
