/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DTO.LSP_DTO;
import DAL.LSP_DAL;

import java.util.List;

/**
 *
 * @author abc
 */
public class LSP_BUS {
    public LSP_BUS() {}
    LSP_DAL lsp_dal = new LSP_DAL();
    public List SelectData(String sql){
       return lsp_dal.SelectData(sql);
    };
}
