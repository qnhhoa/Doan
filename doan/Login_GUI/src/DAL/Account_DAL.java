/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;
import DTO.Account_DTO;
import GUI.MainFrame;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
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
    public boolean Insert(Account_DTO ac){
        try {
            
            Object[] arg= {ac.getID(),ac.getPass(),ac.getflag()};
            
            String em_SQL;
            em_SQL = String.format("INSERT INTO Users(Usrname,cPassword,authority) VALUES ('%s','%s','%s')",arg);

            Statement statement = DAL.ConnectionDB_DAL.conn.createStatement();

            int rows_employee = statement.executeUpdate(em_SQL);
            if (rows_employee > 0){
                System.out.println("Insert successfull");
            }else {
                System.out.println("Insert fail");
            }
        }catch (SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public List getINFO(Account_DTO account_DTO) {
        List<Object[]> list_obj = new ArrayList<>();
        try{
           
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select FullName,PhoneNumber from Staff where StaffID='"+account_DTO.getID()+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            Object[] obj;
            if(set.next()){
                obj = new Object[2];
                obj[0]=set.getString("FullName");
                obj[1]=set.getString("PhoneNumber");
                list_obj.add(obj);
            }
            
        } catch  (Exception e) {
            e.printStackTrace();
        }
        return list_obj;
    }
    public boolean ChangePass(Account_DTO account_DTO){
        try {
            Object arg[]= {account_DTO.getPass(),account_DTO.getID()};
            String sql;
            sql = String.format("UPDATE Users SET cPassword='%s' WHERE Usrname  = '%s'", arg);
            Statement statement = DAL.ConnectionDB_DAL.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Update successfull");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }
    public boolean checkPass(Account_DTO account_DTO){
        String pass ="";
        try{
            connection = DAL.ConnectionDB_DAL.OpenConnection();
            String query ="select cPassword from Users where Usrname='"+account_DTO.getID()+"'";
            stm = connection.createStatement();
            set = stm.executeQuery(query);
            
            if(set.next()){
                pass = set.getString(1);
            }
            
        } catch  (Exception e) {
            e.printStackTrace();
            return false;
        }
        if(account_DTO.getPass().equals(pass)){
                    return true;
        }else{
            return false;    
        }
        
    }
}
