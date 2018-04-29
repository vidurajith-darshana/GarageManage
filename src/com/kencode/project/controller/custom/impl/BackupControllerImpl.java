/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.BackupController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.BackupDAO;
import com.kencode.project.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class BackupControllerImpl implements BackupController{
    
    private BackupDAO backupDAO;

    public BackupControllerImpl() {
        backupDAO=(BackupDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.BACKUP);
    }
    
    

    @Override
    public boolean backupDataWithOutDatabase(String dumpExePath, String host, String port, String user, String password, String database, String backupPath) throws Exception {

        return backupDAO.backupDataWithOutDatabase(dumpExePath, host, port, user, password, database, backupPath);
    }

    @Override
    public ArrayList<SuperDTO> getAll() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public SuperDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(SuperDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
