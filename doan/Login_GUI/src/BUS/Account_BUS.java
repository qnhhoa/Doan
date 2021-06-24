/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Account_DAL;
import DTO.Account_DTO;
import java.util.List;

/**
 *
 * @author Huy
 */
public class Account_BUS {
    Account_DAL account_DAL = new Account_DAL();
    
    public boolean Login (Account_DTO account_DTO){
        return account_DAL.Login(account_DTO);
     };
    public boolean ChangePass(Account_DTO acc_DTO){
        return account_DAL.ChangePass(acc_DTO);
    }
    
    public List getINFO (Account_DTO account_DTO){
       return account_DAL.getINFO(account_DTO);
    }
    
    public boolean checkPass (Account_DTO account_DTO){
        return account_DAL.checkPass(account_DTO);
    }
}
