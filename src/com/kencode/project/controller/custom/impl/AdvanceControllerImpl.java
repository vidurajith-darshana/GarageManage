/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.AdvanceController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.AdvanceDAO;
import com.kencode.project.dto.AdvanceDTO;

/**
 *
 * @author Vidurajith
 */
public class AdvanceControllerImpl implements AdvanceController{

    private AdvanceDAO advanceDAO;
    
    public AdvanceControllerImpl() {
        
        advanceDAO=(AdvanceDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.ADVANCE);
    }

    
    @Override
    public boolean addAdvance(AdvanceDTO advance) throws Exception {
        
        return advanceDAO.addAdvance(advance);
    }

    @Override
    public boolean updateAdvance(int advance,String adNo) throws Exception {
        
        return advanceDAO.updateAdvance(advance,adNo);
    }

    @Override
    public Object[] getAdvance(String invoiceNo) throws Exception {
       
        return advanceDAO.getAdvance(invoiceNo);
    }
    
}
