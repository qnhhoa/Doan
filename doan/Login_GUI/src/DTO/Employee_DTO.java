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
public class Employee_DTO {
    String staffId;
    String fullName;
    String gender;
    String address;
    String phoneNumber;
    Date dateOfBird;
    String department;

    public Employee_DTO(String staffId, String fullName, String gender, String address, String phoneNumber, Date dateOfBird, String department) {
        this.staffId = staffId;
        this.fullName = fullName;
        this.gender = gender;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.dateOfBird = dateOfBird;
        this.department = department;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public boolean checkContain(String str){
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        if(staffId.toUpperCase().contains(str.toUpperCase())==true ||
           fullName.toUpperCase().contains(str.toUpperCase())==true ||
           gender.toUpperCase().contains(str.toUpperCase())==true ||
           address.toUpperCase().contains(str.toUpperCase())==true ||
           phoneNumber.toUpperCase().contains(str.toUpperCase())==true ||
           df.format(dateOfBird).toUpperCase().contains(str.toUpperCase())==true ||
           department.toUpperCase().contains(str.toUpperCase())==true)   {
            return true;
        }else{
            return false;
        }
        
    
    }
    
}
