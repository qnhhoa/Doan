/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAL.Employee_DAL;
import DTO.Employee_DTO;
import java.util.List;

/**
 *
 * @author TienVinh
 */
public class Employee_BUS {

    public Employee_BUS() {
    }
    Employee_DAL em_dal = new Employee_DAL();
    public boolean Insert(Employee_DTO em_dto){
       return em_dal.Insert(em_dto);
    };
    public boolean Update(Employee_DTO em_dto){
       return em_dal.Update(em_dto);
    };
    public boolean Delete(Employee_DTO em_dto){
       return em_dal.Delete(em_dto);
    };
    public List SelectData(String sql){
       return em_dal.SelectData(sql);
    };
}
