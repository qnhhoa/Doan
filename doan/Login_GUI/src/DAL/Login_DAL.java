/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import java.sql.*;
import javax.swing.JOptionPane;
//import DAL.ConnectionDB_DAL;

/**
 *
 * @author Huy
 */
public class Login_DAL {
    Connection connection=null;
    Statement stm=null;
    ResultSet set=null;
        
    public boolean Login(String IDTextField, String PasswordField){
        try{
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select * from Users where Usrname='"+IDTextField+"' and cPassword='"+PasswordField+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            if(set.next()){
                return true;
            }
        } catch  (Exception e) {
        }
        return false;
    }
}
