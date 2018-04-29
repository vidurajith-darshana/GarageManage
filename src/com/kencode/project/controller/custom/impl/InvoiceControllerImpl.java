/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.InvoiceController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.InvoiceDAO;
import com.kencode.project.dto.InvoiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class InvoiceControllerImpl implements InvoiceController{
    
    private InvoiceDAO invoiceDAO;

    public InvoiceControllerImpl() {
        invoiceDAO=(InvoiceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.INVOICE);
    }
    
    

    @Override
    public ArrayList<InvoiceDTO> getAll() throws Exception {

        return invoiceDAO.getAll();
    }

    @Override
    public InvoiceDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(InvoiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(InvoiceDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean deleteInvoice(String invoice) throws Exception {
        
        return invoiceDAO.deleteInvoice(invoice);
    }

   
}
