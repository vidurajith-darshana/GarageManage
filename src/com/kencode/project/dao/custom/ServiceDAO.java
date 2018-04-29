/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.ServiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface ServiceDAO extends SuperDAO<ServiceDTO>{
    
    public ArrayList<ServiceDTO> searchOrders(String id)throws Exception;
    
    public boolean add(ArrayList<ServiceDTO> slist) throws Exception;
}
