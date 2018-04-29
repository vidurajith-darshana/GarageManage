/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.InvoiceDTO;

/**
 *
 * @author Vidura
 */
public interface InvoiceController extends SuperController<InvoiceDTO>{
    
    public boolean deleteInvoice(String invoice) throws Exception;
}
