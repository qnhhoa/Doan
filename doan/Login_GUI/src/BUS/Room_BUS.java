/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Room_DAL;
import DTO.Room_DTO;

/**
 *
 * @author TienVinh
 */
public class Room_BUS {

    public Room_BUS() {
    };
    
     Room_DAL room_dal= new Room_DAL();
     public boolean Update(Room_DTO room_dto){
       return room_dal.Update(room_dto);
    };
}
