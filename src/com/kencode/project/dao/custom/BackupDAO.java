/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface BackupDAO extends SuperDAO<SuperDTO>{

    @Override
    public default ArrayList<SuperDTO> getAll() throws Exception {return null;}
    
    public boolean backupDataWithOutDatabase(String dumpExePath, String host, String port, String user, String password, String database, String backupPath) throws Exception;
}
