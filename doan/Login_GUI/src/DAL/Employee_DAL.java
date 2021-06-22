/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Employee_DTO;

import java.sql.Connection;
import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
    
/**
 *
 * @author TienVinh
 */
public class Employee_DAL {
    public Employee_DAL(){
    };
    public boolean Insert(Employee_DTO em){
        try {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Object arg[]= {em.getFullName(),em.getGender(),em.getAddress(),em.getPhoneNumber(),df.format(em.getDateOfBird()),em.getDepartment()};

            String em_SQL;
            em_SQL = String.format("INSERT INTO Staff(FullName,Gender,cAddress,PhoneNumber,DateofBirth,Position) VALUES ('%s','%s','%s','%s','%s','%s')",arg);

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
    public boolean Delete(Employee_DTO em){
        try {
           
            Object arg[]= {em.getStaffId()};
            String sql;
      
            String studentFee_SQL;
            studentFee_SQL = String.format("DELETE FROM Staff WHERE StaffID  = '%s'", arg);
            Statement statement = DAL.ConnectionDB_DAL.conn.createStatement();
            int rows = statement.executeUpdate(studentFee_SQL);
            if (rows > 0 ){
                System.out.println("Delete successfull");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean Update(Employee_DTO em) {
        try {
             DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Object arg[]= {em.getFullName(),em.getGender(),em.getAddress(),em.getPhoneNumber(),df.format(em.getDateOfBird()),em.getDepartment(),em.getStaffId()};
            String sql;
            sql = String.format("UPDATE Staff SET FullName='%s', Gender='%s', cAddress='%s', phoneNumber='%s', DateOfBird='%s', Department='%s' WHERE StaffID  = '%s'", arg);
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
    public List SelectData(String selectSql){
        List<Employee_DTO> list_em = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = DAL.ConnectionDB_DAL.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Employee_DTO em = new Employee_DTO(rs.getString("StaffID"),rs.getString("FullName"),rs.getString("Gender"),rs.getString("cAddress"),rs.getString("PhoneNumber"),rs.getDate("DateofBirth"),rs.getString("Position"));
                list_em.add(em);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_em;
    }
//    public List SelectData(String selectSql){
//        try{
//            LoadData(selectSql);
//        }catch (Exception ex){
//            JOptionPane.showMessageDialog(null,ex.toString(),"Error at GetData() function", JOptionPane.ERROR_MESSAGE);
//        }
//
//        return this.list_em;
//    }
}
