/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.GoodsController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.GoodsDAO;
import com.kencode.project.dto.GoodsDTO;
import java.math.BigDecimal;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class GoodsControllerImpl implements GoodsController{
    
    private GoodsDAO goodsDAO;

    public GoodsControllerImpl() {
        goodsDAO=(GoodsDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.GOODS);
    }
    
    

    @Override
    public ArrayList<GoodsDTO> getAll() throws Exception {

        return goodsDAO.getAll();
    }

    @Override
    public GoodsDTO search(String id) throws Exception {
        return goodsDAO.search(id);
    }

    @Override
    public boolean add(GoodsDTO dto) throws Exception {
        return goodsDAO.add(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        return goodsDAO.delete(id);
    }

    @Override
    public boolean update(GoodsDTO dto) throws Exception {
        return goodsDAO.update(dto);
    }

    @Override
    public String getGID(String goods) throws Exception {

        return goodsDAO.getGID(goods);
    }

    @Override
    public String getGoodName(String gid) throws Exception {
        
        return goodsDAO.getGoodName(gid);
    }

    @Override
    public BigDecimal getUnitPrice(String gid) throws Exception {
        
        return goodsDAO.getUnitPrice(gid);
    }

   
    
}
