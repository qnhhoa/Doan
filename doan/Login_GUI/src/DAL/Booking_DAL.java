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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
              DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
              
               String SQL;
             if (booking.getCheckInDate()==null && booking.getCheckOutDate()==null){
                  Object [] arg= {booking.getRoomId(),booking.getCustomerId(),"",""};
                 
                  SQL = String.format("INSERT INTO Booking(RoomId,ClientID,CheckInDate,CheckOutDate) VALUES ('%s','%s','%s','%s')",arg);
             }else{
                 Object [] arg= {booking.getRoomId(),booking.getCustomerId(),formatter.format(booking.getCheckInDate()),""};
                 SQL = String.format("INSERT INTO Booking(RoomId,ClientID,CheckInDate,CheckOutDate) VALUES ('%s','%s','%s','%s')",arg);
             }


            Statement statement = DAL.ConnectionDB_DAL.conn.createStatement();

            int rows = statement.executeUpdate(SQL);
            if (rows > 0){
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
     public boolean Delete(Booking_DTO booking){
        try {
            Object arg[]= {booking.getBookId()};
            String sql;
            sql = String.format("DELETE FROM booking WHERE bookId  = '%s'", arg);
            Statement statement = DAL.ConnectionDB_DAL.conn.createStatement();
            int rows = statement.executeUpdate(sql);
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
    public boolean Update(Booking_DTO booking) {
        try {
            DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
            
            System.out.println("dateCheckin " + formatter.format(booking.getCheckInDate()));
            
            String sql;
            if (booking.getCheckInDate()==null && booking.getCheckOutDate()==null){
                Object[] arg= {booking.getRoomId(),booking.getCustomerId(),booking.getBookId()};
                sql = String.format("UPDATE Booking SET RoomId='%s', ClientID='%s'WHERE bookingId  = '%s'", arg);
                
            }else if (booking.getCheckOutDate()==null){
                Object[] arg= {booking.getRoomId(),booking.getCustomerId(),formatter.format(booking.getCheckInDate()),booking.getBookId()};
                sql = String.format("UPDATE Booking SET RoomId='%s', ClientID='%s', CheckInDate='%s' WHERE bookingId  = '%s'", arg);
            }else {
                Object[] arg= {booking.getRoomId(),booking.getCustomerId(),formatter.format(booking.getCheckInDate()),formatter.format(booking.getCheckOutDate()),booking.getBookId()};
                sql = String.format("UPDATE Booking SET RoomId='%s', ClientID='%s', CheckInDate='%s', CheckOutDate='%s' WHERE bookingId  = '%s'", arg);
            }
            
            System.out.println(sql);
            Statement statement = DAL.ConnectionDB_DAL.conn.createStatement();
            int rows = statement.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Update successfull");
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,e.toString(),"Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;

    }
    public List SelectData(String selectSql){
        List<Booking_DTO> list_booking = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = DAL.ConnectionDB_DAL.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Booking_DTO em = new Booking_DTO(rs.getString(2),rs.getString(3),rs.getString(4),rs.getDate(5),rs.getDate(6));
                list_booking.add(em);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_booking;
    }
}
