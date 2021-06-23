/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

/**
 *
 * @author Huy
 */
public class Account_DTO {
    
    String ID;
    String Pass;
    char flag;
    String fullname;
    String sdt;
    
    public Account_DTO (){
    }
    
    public Account_DTO (String ID, String Pass) {
        this.ID = ID;
        this.Pass = Pass;
    }
    
    public void setID(String ID) {
        this.ID=ID;
    }
    
    public String getID() {
        return ID;
    }

    public String getPass() {
        return Pass;
    }
    
    public void setPass(String Pass) {
        this.Pass = Pass;
    }

    public char getflag() {
        return flag;
    }

    public void setflag(char flag) {
        this.flag = flag;
    }
    
    public String getfullname() {
        return fullname;
    }
    
    public void setfullname(String fullname) {
        this.fullname = fullname;
    }
    
    public String getsdt() {
        return sdt;
    }
    
    public void setsdt(String sdt) {
        this.sdt = sdt;
    }
}
