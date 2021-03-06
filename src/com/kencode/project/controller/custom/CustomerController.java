/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.BoatDTO;
import com.kencode.project.dto.CustomerDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface CustomerController extends SuperController<CustomerDTO>{
    
    public boolean addNewCustomer(CustomerDTO customer,ArrayList<BoatDTO>boatList)throws Exception;
    
    public boolean updateCustomer(CustomerDTO customer,ArrayList<BoatDTO>boatList)throws Exception;
}
