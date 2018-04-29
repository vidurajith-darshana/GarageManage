/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.InvoiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface InvoiceDAO extends SuperDAO<InvoiceDTO>{

    @Override
    public default boolean delete(String id) throws Exception {return true;}

    @Override
    public default ArrayList<InvoiceDTO> getAll() throws Exception {return null;}

    @Override
    public default InvoiceDTO search(String id) throws Exception {return null;}

    @Override
    public default boolean update(InvoiceDTO dto) throws Exception {return true;}
    
    public boolean deleteInvoice(String ino) throws Exception;
}
