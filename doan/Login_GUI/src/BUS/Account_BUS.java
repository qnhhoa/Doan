/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Account_DAL;
import DTO.Account_DTO;

/**
 *
 * @author Huy
 */
public class Account_BUS {
    Account_DAL login_dal = new Account_DAL();
    
    public boolean Login (Account_DTO login_DTO){
        return login_dal.Login(login_DTO);
     };
    
}
