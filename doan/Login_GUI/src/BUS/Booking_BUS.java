/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Booking_DAL;
import DTO.Booking_DTO;
import java.util.List;

/**
 *
 * @author TienVinh
 */
public class Booking_BUS {

    public Booking_BUS() {
    }
    
     Booking_DAL booking_dal= new Booking_DAL();
     public boolean Insert(Booking_DTO booking_dto){
       return booking_dal.Insert(booking_dto);
    };

     public boolean Update(Booking_DTO booking_dto){
       return booking_dal.Update(booking_dto);
    };

     public boolean Delete(Booking_DTO booking_dto){
       return booking_dal.Delete(booking_dto);
    };

     public List Select(String sql){
       return booking_dal.SelectData(sql);
    };
}
