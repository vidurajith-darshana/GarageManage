/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.OrdersController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.CustGoodsDAO;
import com.kencode.project.dao.custom.InvoiceDAO;
import com.kencode.project.dao.custom.OrderDetailDAO;
import com.kencode.project.dao.custom.OrdersDAO;
import com.kencode.project.dao.custom.ServiceDAO;
import com.kencode.project.dao.custom.ServiceInvoiceDAO;
import com.kencode.project.dao.db.ConnectionFactory;
import com.kencode.project.dto.CustGoodsDTO;
import com.kencode.project.dto.InvoiceDTO;
import com.kencode.project.dto.OrderDetailDTO;
import com.kencode.project.dto.OrdersDTO;
import com.kencode.project.dto.ServiceDTO;
import com.kencode.project.dto.ServiceInvoiceDTO;
import com.kencode.project.view.InvoicePanel;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura
 */
public class OrdersControllerImpl implements OrdersController{
    
    private OrdersDAO ordersDAO;
    private OrderDetailDAO orderDetailDAO;
    private ServiceDAO serviceDAO;
    private ServiceInvoiceDAO serviceInvoiceDAO;
    private CustGoodsDAO custDAO;
    private InvoiceDAO invoiceDAO;
    
    private Connection conn;

    public OrdersControllerImpl() {
        ordersDAO=(OrdersDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.ORDERS);
        orderDetailDAO=(OrderDetailDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.ORDERDETAIL);
        serviceDAO=(ServiceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.SERVICE);
        custDAO=(CustGoodsDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.CUSTGOOD);
        invoiceDAO=(InvoiceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.INVOICE);
        serviceInvoiceDAO=(ServiceInvoiceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.SERVICEINVOICE);
        
        conn=ConnectionFactory.getInstance().getConnection();
    }
    
    

    @Override
    public ArrayList<OrdersDTO> getAll() throws Exception {

        return ordersDAO.getAll();
    }

    @Override
    public OrdersDTO search(String id) throws Exception {
        return ordersDAO.search(id);
    }

    @Override
    public boolean add(OrdersDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(OrdersDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<OrdersDTO> searchOrders(String date) throws Exception {
        return ordersDAO.searchOrders(date);
    }

    @Override
    public boolean add(OrdersDTO o,InvoiceDTO in, ArrayList<OrderDetailDTO> detailList, ArrayList<ServiceInvoiceDTO> serviceList, ArrayList<CustGoodsDTO> custList) throws Exception {

        try{
            conn.setAutoCommit(false);
            
            boolean addOrder=ordersDAO.add(o);
            if(addOrder){
                boolean addInvoice=invoiceDAO.add(in);
                if(addInvoice){
                    
                    boolean isCust=custDAO.add(custList);
                    if(isCust){
                       
                        boolean isService=serviceInvoiceDAO.add(serviceList);
                        System.out.println("2333");
                        
                        if(isService){
                            System.out.println("2");
                            boolean addDetail=orderDetailDAO.add(detailList);
                            if(addDetail){
                                conn.commit();
                                return true;
                            }
                        }
                    }
                }
            }
            conn.rollback();
            return false;
        }catch(SQLException ex){
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
            conn.rollback();
            return false;
        }finally{
            conn.setAutoCommit(true);
        }
    }

    @Override
    public boolean add(OrdersDTO o,InvoiceDTO in, ArrayList<OrderDetailDTO> detailList, ArrayList<CustGoodsDTO> custList) throws Exception {
        
        try{
            conn.setAutoCommit(false);
            
            boolean addOrder=ordersDAO.add(o);
            if(addOrder){
                boolean addInvoice=invoiceDAO.add(in);
                if(addInvoice){
                    boolean isCust=custDAO.add(custList);
                    if(isCust){
                        boolean addDetail=orderDetailDAO.add(detailList);
                        if(addDetail){
                            conn.commit();
                            return true;
                        }
                    }
                }
            }
            conn.rollback();
            return false;
        }catch(SQLException ex){
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
            conn.rollback();
            return false;
        }finally{
            conn.setAutoCommit(true);
        }
    }

    @Override
    public boolean deleteOrder(String oid) throws Exception {
        
        return ordersDAO.deleteOrder(oid);
    }

    @Override
    public boolean add(OrdersDTO o, ArrayList<OrderDetailDTO> detailList) throws Exception {
        
        try{
            conn.setAutoCommit(false);
            
            boolean isAdd=ordersDAO.add(o);
            if(isAdd){
                boolean isAddList=orderDetailDAO.add(detailList);
                if(isAddList){
                    conn.commit();
                    return true;
                }
            }
            conn.rollback();
            return false;
        }catch(SQLException ex){
            conn.rollback();
            return false;
        }finally{
            conn.setAutoCommit(true);
        }
    }

    @Override
    public boolean add(OrdersDTO o, ArrayList<OrderDetailDTO> detailList, ArrayList<ServiceDTO> serviceList) throws Exception {
        
        try{
            conn.setAutoCommit(false);
            
            boolean isAdd=ordersDAO.add(o);
            if(isAdd){
                boolean isAddList=orderDetailDAO.add(detailList);
                if(isAddList){
                    boolean isService=serviceDAO.add(serviceList);
                    if(isService){
                        conn.commit();
                        return true;
                    }
                }
            }
            conn.rollback();
            return false;
        }catch(SQLException ex){
            conn.rollback();
            return false;
        }finally{
            conn.setAutoCommit(true);
        }
    }
}