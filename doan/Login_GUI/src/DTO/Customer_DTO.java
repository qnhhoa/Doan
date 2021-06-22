/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author TienVinh
 */
public class Customer_DTO {
    String customer_id;
    String fullname;
    String cccd;
    String phoneNumber;
    Date dateOfBird;

    public Customer_DTO(String customer_id, String fullname, String cccd, String phoneNumber, Date dateOfBird) {
        this.customer_id = customer_id;
        this.fullname = fullname;
        this.cccd = cccd;
        this.phoneNumber = phoneNumber;
        this.dateOfBird = dateOfBird;
    }
    
    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(Date dateOfBird) {
        this.dateOfBird = dateOfBird;
    }

    public boolean checkContain(String str){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if(customer_id.toUpperCase().contains(str.toUpperCase())==true ||
           fullname.toUpperCase().contains(str.toUpperCase())==true ||
           cccd.toUpperCase().contains(str.toUpperCase())==true ||
           phoneNumber.toUpperCase().contains(str.toUpperCase())==true ||
           df.format(dateOfBird).toUpperCase().contains(str.toUpperCase())==true){
            return true;
        }else{
            return false;
        }
        
    
    }
}
