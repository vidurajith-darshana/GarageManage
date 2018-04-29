/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.SuperDTO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface IdController extends SuperController<SuperDTO> {

    @Override
    public default ArrayList<SuperDTO> getAll() throws Exception {return null;}
    
    public String getNewID(String tblName, String colName, String preFix, int digitCount) throws ClassNotFoundException, SQLException;
    
    public String getNewID(String lastId, String prefix) throws SQLException, ClassNotFoundException;
    
    public String getNewIDFor2ndDB(String tblName, String colName, String preFix, int digitCount) throws ClassNotFoundException, SQLException;
    
    public String getNewIDFor2ndDB(String lastId, String prefix) throws SQLException, ClassNotFoundException;
}
