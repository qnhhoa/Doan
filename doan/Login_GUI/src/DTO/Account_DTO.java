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
    
    public Account_DTO (){
    }
    public Account_DTO (String ID, String Pass) {
        this.ID = ID;
        this.Pass = Pass;
    }
    
    public Account_DTO (String ID, String Pass, char flag) {
        this.ID = ID;
        this.Pass = Pass;
        this.flag = flag;
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
    

}
