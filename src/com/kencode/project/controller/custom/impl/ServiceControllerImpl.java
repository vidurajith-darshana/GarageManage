/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.ServiceController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.ServiceDAO;
import com.kencode.project.dto.ServiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class ServiceControllerImpl implements ServiceController{
    
    private ServiceDAO serviceDAO;

    public ServiceControllerImpl() {
        serviceDAO=(ServiceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.SERVICE);
    }
    
    

    @Override
    public ArrayList<ServiceDTO> getAll() throws Exception {

        return serviceDAO.getAll();
    }

    @Override
    public ServiceDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(ServiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ServiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ServiceDTO> searchOrders(String id) throws Exception {
        return  serviceDAO.searchOrders(id);
    }

}
