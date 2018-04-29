/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.ServiceInvoiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface ServiceInvoiceController extends SuperController<ServiceInvoiceDTO>{

    @Override
    public default boolean add(ServiceInvoiceDTO dto) throws Exception {return true;}

    @Override
    public default boolean delete(String id) throws Exception {return true;}

    @Override
    public default ServiceInvoiceDTO search(String id) throws Exception {return null;}

    @Override
    public default boolean update(ServiceInvoiceDTO dto) throws Exception {return true;}
    
    public ArrayList<ServiceInvoiceDTO> searchOrders(String id)throws Exception;
    
    public boolean add(ArrayList<ServiceInvoiceDTO> slist) throws Exception;
    
}
