/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Booking_DTO;
import java.sql.Connection;
import java.sql.*;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author TienVinh
 */
public class Booking_DAL {
     public boolean Insert(Booking_DTO booking){
        try {
            Object arg[]= {booking.getBookId(),booking.getRoomId(),booking.getCustomerId(),booking.getCheckInDate(),booking.getCheckOutDate()};

            String SQL;
            SQL = String.format("INSERT INTO Booking VALUES ('%s','%s','%s','%s','%s')",arg);

            Statement statement = GUI.Login_GUI.conection.conn.createStatement();

            int rows = statement.executeUpdate(SQL);
            if (rows > 0){
                System.out.println("Insert successfull");
            }else {
                System.out.println("Insert fail");
            }
        }catch (SQLException ex){
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return false;
        
    }
     public boolean Delete(Booking_DTO booking){
        try {
            Object arg[]= {booking.getBookId()};
            String sql;
            sql = String.format("DELETE FROM booking WHERE bookId  = '%s'", arg);
            Statement statement = GUI.Login_GUI.conection.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0 ){
                System.out.println("Delete successfull");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    public boolean Update(Booking_DTO booking) {
        try {
            Object arg[]= {booking.getRoomId(),booking.getCustomerId(),booking.getCheckInDate(),booking.getCheckOutDate(),booking.getBookId()};
            String sql;
            sql = String.format("UPDATE Booking SET RoomId='%s', CustomerId='%s', CheckInDate='%s', CheckOutDate='%s' WHERE bookId  = '%s'", arg);
            Statement statement = GUI.Login_GUI.conection.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Update successfull");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }
    public List SelectData(String selectSql){
        List<Booking_DTO> list_booking = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = GUI.Login_GUI.conection.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Booking_DTO em = new Booking_DTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                list_booking.add(em);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_booking;
    }
}
