/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

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
    
    
    public Room_DTO(String roomId, String typeOfRoom, String status, String employeeId) {
        this.roomId = roomId;
        this.typeOfRoom = typeOfRoom;
        this.status = status;
        this.employeeId = employeeId;
       
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

   
}
