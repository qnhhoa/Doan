/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author TienVinh
 */
public class Room_DTO {
    public Room_DTO(){};
    String roomId;
    String typeOfRoom;
    String status;
    String employeeId;
    String bookingId;
    
    
    public Room_DTO(String roomId, String typeOfRoom, String status, String employeeId, String bookingId) {
        this.roomId = roomId;
        this.typeOfRoom = typeOfRoom;
        this.status = status;
        this.employeeId = employeeId;
        this.bookingId = bookingId;
    }
    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

  

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
    public boolean checkContain(String str){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if(roomId.toUpperCase().contains(str.toUpperCase())==true ||
           typeOfRoom.toUpperCase().contains(str.toUpperCase())==true ||
           status.toUpperCase().contains(str.toUpperCase())==true ||
           employeeId.toUpperCase().contains(str.toUpperCase())==true ||
           bookingId.toUpperCase().contains(str.toUpperCase())==true)   {
            return true;
        }else{
            return false;
        }
        
    
    }
   
}
