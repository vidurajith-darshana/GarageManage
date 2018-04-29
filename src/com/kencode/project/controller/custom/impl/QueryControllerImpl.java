/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.QueryController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.QueryDAO;
import com.kencode.project.dto.GoodsDTO;
import com.kencode.project.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class QueryControllerImpl implements QueryController{
    
    private QueryDAO queryDAO;

    public QueryControllerImpl() {
        queryDAO=(QueryDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.QUERY);
    }

    
    @Override
    public ArrayList<GoodsDTO> searchOrderDetail(String id) throws Exception {
        return queryDAO.searchOrderDetail(id);
    }

  
}
