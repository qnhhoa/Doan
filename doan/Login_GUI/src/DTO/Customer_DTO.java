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
public class Customer_DTO {
    String customer_id;
    String fullname;
    String cccd;
    String phoneNumber;
    String dateOfBird;

    public Customer_DTO(String customer_id, String fullname, String cccd, String phoneNumber, String dateOfBird) {
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

    public String getDateOfBird() {
        return dateOfBird;
    }

    public void setDateOfBird(String dateOfBird) {
        this.dateOfBird = dateOfBird;
    }
    
}
