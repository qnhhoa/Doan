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
    Account_DAL account_DAL = new Account_DAL();
    
    public boolean Login (Account_DTO account_DTO){
        return account_DAL.Login(account_DTO);
     };
    
    
    public void getINFO (Account_DTO account_DTO){
        account_DAL.getINFO(account_DTO);
    }
    
    public boolean checkPass (Account_DTO account_DTO){
        return account_DAL.checkPass(account_DTO);
    }
}
