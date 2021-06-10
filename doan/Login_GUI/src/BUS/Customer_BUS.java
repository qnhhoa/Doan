/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Customer_DAL;
import DTO.Customer_DTO;
import java.util.List;

/**
 *
 * @author TienVinh
 */
public class Customer_BUS {

    public Customer_BUS() {
    };
    Customer_DAL cus_DAL = new Customer_DAL();
    public boolean Insert(Customer_DTO cus){
       return cus_DAL.Insert(cus);
    }
    public boolean Delete(Customer_DTO cus){
       return cus_DAL.Delete(cus);
    }
    public boolean Update(Customer_DTO cus){
       return cus_DAL.Update(cus);
    }
    public List Select(String sqlString){
       return cus_DAL.SelectData(sqlString);
    }
}
