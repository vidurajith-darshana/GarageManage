/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.CustGoodsContorller;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.CustGoodsDAO;
import com.kencode.project.dto.CustGoodsDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class CustGoodsControllerImpl implements CustGoodsContorller{

    private CustGoodsDAO custGoodDAO;

    public CustGoodsControllerImpl() {
        custGoodDAO=(CustGoodsDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.CUSTGOOD);

    }
    
    
    @Override
    public ArrayList<CustGoodsDTO> getAll() throws Exception {

        return custGoodDAO.getAll();
    }

    @Override
    public CustGoodsDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(CustGoodsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustGoodsDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustGoodsDTO> searchInvoice(String id) throws Exception {
        return custGoodDAO.searchInvoice(id);
    }

   
    
}
