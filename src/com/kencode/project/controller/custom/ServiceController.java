/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.OrdersDTO;
import com.kencode.project.dto.ServiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface ServiceController extends SuperController<ServiceDTO>{
    
    public ArrayList<ServiceDTO> searchOrders(String id)throws Exception;
}
