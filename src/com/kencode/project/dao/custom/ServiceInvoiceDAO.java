/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.ServiceInvoiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface ServiceInvoiceDAO extends SuperDAO<ServiceInvoiceDTO>{

    @Override
    public default boolean add(ServiceInvoiceDTO dto) throws Exception {return true;}

    @Override
    public default boolean delete(String id) throws Exception {return true;}

    @Override
    public default boolean update(ServiceInvoiceDTO dto) throws Exception {return true;}

    @Override
    public default ServiceInvoiceDTO search(String id) throws Exception {return null;}
    
    public ArrayList<ServiceInvoiceDTO> searchOrders(String id)throws Exception;
    
    public boolean add(ArrayList<ServiceInvoiceDTO> slist) throws Exception;
    
}
