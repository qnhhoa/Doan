/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Account_DTO;
import GUI.MainFrame;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.text.PasswordView;
//import DAL.ConnectionDB_DAL;

/**
 *
 * @author Huy
 */
public class Account_DAL {
    Connection connection=null;
    Statement stm=null;
    ResultSet set=null;
        
    public boolean Login(Account_DTO account_DTO){
        try{
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select * from Users where Usrname='"+account_DTO.getID()+"' and cPassword='"+account_DTO.getPass()+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            if(set.next()){
                String flag = set.getString(3);
                account_DTO.setflag(flag.charAt(0));
                return true;
            }
        } catch  (Exception e) {
        }
        return false;
    }
    
    public void getINFO(Account_DTO account_DTO) {
        try{
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select * from Staff where StaffID='"+account_DTO.getID()+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            if(set.next()){
                String fullname = set.getString(3);
                account_DTO.setfullname(fullname);
                
                String sdt = set.getString(6);
                account_DTO.setsdt(sdt);
            }
            
        } catch  (Exception e) {
        }
    }
    
    public boolean checkPass(Account_DTO account_DTO){
        
        try{
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select cPassword from Users where Usrname='"+account_DTO.getID()+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            String pass ="";
            if(set.next()){
                pass = set.getString(1);
            }
            if(account_DTO.getPass() == pass){
                    return false;
            }
        } catch  (Exception e) {
        }
        return true;
    }
}
