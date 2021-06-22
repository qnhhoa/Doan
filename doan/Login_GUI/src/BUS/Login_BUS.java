/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Login_DAL;
import DTO.Login_DTO;

/**
 *
 * @author Huy
 */
public class Login_BUS {
    Login_DAL login_dal = new Login_DAL();
    
    public boolean Login (Login_DTO login_DTO){
        return login_dal.Login(login_DTO);
     };
    
}
