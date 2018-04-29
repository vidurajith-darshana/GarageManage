/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.PasswordController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.PasswordDAO;
import com.kencode.project.dto.PasswordDTO;
import java.util.ArrayList;

/**
 *
 * @author Sandun Dilhan
 */
public class PasswordControllerImpl implements PasswordController{
    private PasswordDAO passwordDAO;

    public PasswordControllerImpl() {
        passwordDAO=(PasswordDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.PASSWORD);
    }
    

    @Override
    public ArrayList<PasswordDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PasswordDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(PasswordDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PasswordDTO dto) throws Exception {
        return passwordDAO.update(dto);
    }

    @Override
    public PasswordDTO selectPassword(String password, String name) throws Exception {
        return passwordDAO.selectPassword(password, name);
    }
    
}
