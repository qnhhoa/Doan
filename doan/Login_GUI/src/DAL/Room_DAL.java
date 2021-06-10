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
        try {
            Object arg[]= {room.getEmployeeId(),room.getStatus(),room.getTypeOfRoom(),room.getRoomId()};
            String sql;
            sql = String.format("UPDATE Room SET employeeId='%s', Status='%s', TypeOfRoom='%s' WHERE RoomId  = '%s'", arg);
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
        List<Room_DTO> list_room = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = GUI.Login_GUI.conection.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                Room_DTO room = new Room_DTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
                list_room.add(room);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_room;
    }
}
