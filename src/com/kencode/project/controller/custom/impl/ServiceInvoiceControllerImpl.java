/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.ServiceInvoiceController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.ServiceInvoiceDAO;
import com.kencode.project.dto.ServiceInvoiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class ServiceInvoiceControllerImpl implements ServiceInvoiceController{
    
    private ServiceInvoiceDAO serviceDAO;

    public ServiceInvoiceControllerImpl() {
        
        serviceDAO=(ServiceInvoiceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.SERVICEINVOICE);
    }
    
    

    @Override
    public ArrayList<ServiceInvoiceDTO> getAll() throws Exception {
        
        return serviceDAO.getAll();
    }

    @Override
    public ArrayList<ServiceInvoiceDTO> searchOrders(String id) throws Exception {
        
        return serviceDAO.searchOrders(id);
    }

    @Override
    public boolean add(ArrayList<ServiceInvoiceDTO> slist) throws Exception {
        
        return serviceDAO.add(slist);
    }
    
}
