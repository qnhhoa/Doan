/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.Room_DTO;

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
public class Room_DAL {
    public Room_DAL(){};
    public  boolean Update(Room_DTO room) {  
        
           String sql;        
          try {
            if (room.getEmployeeId()==null && room.getTypeOfRoom()==null){
                Object arg[]= {room.getStatus(),room.getBookingId(),room.getRoomId()};
          System.out.println("BookingId la: " + room.getBookingId());
            sql = String.format("UPDATE Room SET cStatus='%s', BookingID='%s' WHERE RoomId  = '%s'", arg);
            }else{
            
            Object arg[]= {room.getRoomId(),room.getStatus(),room.getTypeOfRoom()};
            sql = String.format("UPDATE Room SET TypeOfRoom='%s', cStatus='%s' WHERE RoomID  = '%s'", arg);

           }           
            
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
        List<Room_DTO> list_room = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = DAL.ConnectionDB_DAL.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Room_DTO room = new Room_DTO(rs.getString("RoomID"),rs.getString("TypeofRoom"),rs.getString("cStatus"),rs.getString("StaffID"),rs.getString("BookingID"));
                list_room.add(room);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_room;
    }
    public List SelectDataJoinBooking(String selectSql){
        List<Object[]> list_Object = new ArrayList<>(); 
        try {
     
            String sql = selectSql;
            ResultSet rs = DAL.ConnectionDB_DAL.conn.createStatement().executeQuery(sql);
            while (rs.next()){
               Object[] object = {rs.getString("RoomID"),rs.getString("TypeofRoom"),rs.getString("cStatus"),rs.getString("StaffID")
                                 ,rs.getString("BookingID"),rs.getString("ClientID"),rs.getString("CheckInDate"),rs.getString("CheckOutDate")};
                list_Object.add(object);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_Object;
    }
}
