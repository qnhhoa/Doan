/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Login_DAL;

/**
 *
 * @author Huy
 */
public class Login_BUS {
    Login_DAL login_dal = new Login_DAL();
    public Login_BUS (){
    };
    
    public boolean Login (String IDTextField, String PasswordField){
        return login_dal.Login(IDTextField, PasswordField);
     };
    
}
