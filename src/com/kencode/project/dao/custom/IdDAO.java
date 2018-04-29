/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.SuperDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface IdDAO extends SuperDAO<SuperDTO>{

    @Override
    public default ArrayList<SuperDTO> getAll() throws Exception {return null;}
    
    public String getLastID(String tblName,String colName)throws ClassNotFoundException,SQLException;
    
    public String getLastIDForConnection2(String tblName,String colName)throws ClassNotFoundException,SQLException;
    
}
