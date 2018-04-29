/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.OrderDetailDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface OrderDetailDAO extends SuperDAO<OrderDetailDTO>{
    
    public boolean add(ArrayList<OrderDetailDTO> olist) throws Exception;
    
    public int getCount(String oid) throws Exception;
}
