/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Account_DTO;
import java.sql.*;
import javax.swing.JOptionPane;
//import DAL.ConnectionDB_DAL;

/**
 *
 * @author Huy
 */
public class Account_DAL {
    Connection connection=null;
    Statement stm=null;
    ResultSet set=null;
        
    public boolean Login(Account_DTO login_DTO){
        try{
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select * from Users where Usrname='"+login_DTO.getID()+"' and cPassword='"+login_DTO.getPass()+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            if(set.next()){
                String flag = set.getString(3);
                login_DTO.setflag(flag.charAt(0));
                return true;
            }
        } catch  (Exception e) {
        }
        return false;
    }
}
