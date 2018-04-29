/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.CustomerController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.BoatDAO;
import com.kencode.project.dao.custom.CustomerDAO;
import com.kencode.project.dao.db.ConnectionFactory;
import com.kencode.project.dto.BoatDTO;
import com.kencode.project.dto.CustomerDTO;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class CustomerControllerImpl implements CustomerController{
    
    private CustomerDAO custDAO;
    private Connection conn;
    private BoatDAO boatDAO;
    
    public CustomerControllerImpl() {
        conn=ConnectionFactory.getInstance().getConnection();
        custDAO=(CustomerDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.CUSTOMER);
        boatDAO=(BoatDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.BOAT);
    }
    
    

    @Override
    public ArrayList<CustomerDTO> getAll() throws Exception {

        return custDAO.getAll();
    }

    @Override
    public CustomerDTO search(String id) throws Exception {
        return custDAO.search(id);
    }

    @Override
    public boolean add(CustomerDTO dto) throws Exception {
        return custDAO.add(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return custDAO.delete(id);
    }

    @Override
    public boolean update(CustomerDTO dto) throws Exception {
        return custDAO.update(dto);
    }

    @Override
    public boolean addNewCustomer(CustomerDTO customer, ArrayList<BoatDTO> boatList) throws Exception {
        try{
            conn.setAutoCommit(false);
            boolean isAdded=custDAO.add(customer);
            if(isAdded){
                boolean isBoat=boatDAO.addBoat(boatList);
                if(isBoat){
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
    public boolean updateCustomer(CustomerDTO customer, ArrayList<BoatDTO> boatList) throws Exception {
        try{
            conn.setAutoCommit(false);
            boolean isUpdate=custDAO.update(customer);
            if(isUpdate){
                boolean isUpdateBoat=boatDAO.addBoat(boatList);
                if(isUpdateBoat){         
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
}
