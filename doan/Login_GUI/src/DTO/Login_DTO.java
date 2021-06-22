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
public class Login_DTO {
    static String ID;
    String Pass;
    char flag;
    public Login_DTO (){
    }
    
    public Login_DTO (String ID, String Pass) {
        this.ID = ID;
        this.Pass = Pass;
    }
    
    public String getID() {
        return ID;
    }

    public String getPass() {
        return Pass;
    }

    public char getflag() {
        return flag;
    }

    public void setflag(char flag) {
        this.flag = flag;
    }
}
