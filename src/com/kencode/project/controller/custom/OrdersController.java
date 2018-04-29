/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.CustGoodsDTO;
import com.kencode.project.dto.InvoiceDTO;
import com.kencode.project.dto.OrderDetailDTO;
import com.kencode.project.dto.OrdersDTO;
import com.kencode.project.dto.ServiceDTO;
import com.kencode.project.dto.ServiceInvoiceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface OrdersController extends SuperController<OrdersDTO>{
    
    public ArrayList<OrdersDTO> searchOrders(String date)throws Exception;
    
    public boolean add(OrdersDTO o,InvoiceDTO in,ArrayList<OrderDetailDTO> detailList,ArrayList<ServiceInvoiceDTO> serviceList,ArrayList<CustGoodsDTO> custList) throws Exception;
    
    public boolean add(OrdersDTO o,InvoiceDTO in,ArrayList<OrderDetailDTO> detailList,ArrayList<CustGoodsDTO> custList) throws Exception;
    
    public boolean add(OrdersDTO o,ArrayList<OrderDetailDTO> detailList) throws Exception;
    
    public boolean add(OrdersDTO o,ArrayList<OrderDetailDTO> detailList,ArrayList<ServiceDTO> serviceList) throws Exception;
    
    public boolean deleteOrder(String oid)throws Exception;
    
}
