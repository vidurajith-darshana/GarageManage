/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.OrderDetailController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.OrderDetailDAO;
import com.kencode.project.dto.OrderDetailDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class OrderDetailControllerImpl implements OrderDetailController{
    
    private OrderDetailDAO orderDetailDAO;

    public OrderDetailControllerImpl() {
        orderDetailDAO=(OrderDetailDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.ORDERDETAIL);
    }
    
    

    @Override
    public ArrayList<OrderDetailDTO> getAll() throws Exception {

        return orderDetailDAO.getAll();
    }

    @Override
    public OrderDetailDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(OrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(OrderDetailDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getCount(String oid) throws Exception {
       
        return orderDetailDAO.getCount(oid);
    }

 
}
