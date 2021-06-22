/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.LSP_DTO;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author abc
 */
public class LSP_DAL {
    public LSP_DAL() {};
    
    public List SelectData(String selectSql){
        List<LSP_DTO> list_lsp = new ArrayList<>(); 

        try {
     
            String sql = selectSql;
            ResultSet rs = DAL.ConnectionDB_DAL.conn.createStatement().executeQuery(sql);
            while (rs.next()){
                LSP_DTO em = new LSP_DTO(rs.getString(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getDate(5));
                list_lsp.add(em);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null,ex.toString(),"Error", JOptionPane.ERROR_MESSAGE);
        }
        return list_lsp;
    }
    
}
