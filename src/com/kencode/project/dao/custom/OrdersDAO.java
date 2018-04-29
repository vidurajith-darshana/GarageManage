/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.OrdersDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface OrdersDAO extends SuperDAO<OrdersDTO>{
   
    public ArrayList<OrdersDTO> searchOrders(String date)throws Exception;

    @Override
    public default boolean delete(String id) throws Exception {return true;}

    @Override
    public default ArrayList<OrdersDTO> getAll() throws Exception {return null;}

    @Override
    public default OrdersDTO search(String id) throws Exception {return null;}

    @Override
    public default boolean update(OrdersDTO dto) throws Exception {return true;}
    
    public boolean deleteOrder(String oid)throws Exception;
    
    
}
