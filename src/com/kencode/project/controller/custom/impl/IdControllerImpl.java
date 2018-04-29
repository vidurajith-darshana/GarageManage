/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.IdController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.IdDAO;
import com.kencode.project.dto.SuperDTO;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class IdControllerImpl implements IdController{
    
    private IdDAO idDAO;

    public IdControllerImpl() {
        idDAO=(IdDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.IDGEN);
    }
    
    

    @Override
    public String getNewID(String tblName, String colName, String preFix, int digitCount) throws ClassNotFoundException, SQLException {

        String lastId = idDAO.getLastID(tblName, colName);
        if (null != lastId) {
            String[] idArray = lastId.split(preFix);

            int id = Integer.parseInt(idArray[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(digitCount);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(id);
            newId = preFix + "0" + newId ;
            return newId;
        } else {
            String newId = preFix;
            for (int i = 0; i < digitCount - 1; i++) {
                newId += "00";
            }
            newId += "1";
            return newId;
        }

    }

    @Override
    public String getNewID(String lastId, String prefix) throws SQLException, ClassNotFoundException {

        String Id = "";
        char[] reg = lastId.toCharArray();
        for (int i = 1; i < reg.length; i++) {
            Id += reg[i];
        }
        int r = Integer.parseInt(Id);
        if (r < 9) {
            return prefix + "00" + (r + 1);
        } else if (r < 99) {
            return prefix + "0" + (r + 1);
        }
        return prefix + (r + 1);
    
        
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

    @Override
    public String getNewIDFor2ndDB(String tblName, String colName, String preFix, int digitCount) throws ClassNotFoundException, SQLException {
        
        String lastId = idDAO.getLastIDForConnection2(tblName, colName);
        if (null != lastId) {
            String[] idArray = lastId.split(preFix);

            int id = Integer.parseInt(idArray[1]);
            id++;
            NumberFormat numberFormat = NumberFormat.getIntegerInstance();
            numberFormat.setMinimumIntegerDigits(digitCount);
            numberFormat.setGroupingUsed(false);
            String newId = numberFormat.format(id);
            newId = preFix + "0" + newId ;
            return newId;
        } else {
            String newId = preFix;
            for (int i = 0; i < digitCount - 1; i++) {
                newId += "00";
            }
            newId += "1";
            return newId;
        }
    }

    @Override
    public String getNewIDFor2ndDB(String lastId, String prefix) throws SQLException, ClassNotFoundException {
        
        String Id = "";
        char[] reg = lastId.toCharArray();
        for (int i = 1; i < reg.length; i++) {
            Id += reg[i];
        }
        int r = Integer.parseInt(Id);
        if (r < 9) {
            return prefix + "00" + (r + 1);
        } else if (r < 99) {
            return prefix + "0" + (r + 1);
        }
        return prefix + (r + 1);
    
    }

  
    
}
