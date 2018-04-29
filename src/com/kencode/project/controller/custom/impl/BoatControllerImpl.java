/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom.impl;

import com.kencode.project.controller.custom.BoatController;
import com.kencode.project.dao.DaoFactory;
import com.kencode.project.dao.custom.BoatDAO;
import com.kencode.project.dto.BoatDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public class BoatControllerImpl implements BoatController{
    
    private BoatDAO boatDAO;

    public BoatControllerImpl() {
        boatDAO=(BoatDAO) DaoFactory.getInstance().getDaoTypes(DaoFactory.DAOTypes.BOAT);
    }
    
    

    @Override
    public ArrayList<BoatDTO> getAll() throws Exception {

        return boatDAO.getAll();
    }

    @Override
    public BoatDTO search(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean add(BoatDTO dto) throws Exception {
        return boatDAO.add(dto);
    }

    @Override
    public boolean delete(String id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(BoatDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addBoat(ArrayList<BoatDTO> boatList) throws Exception {
        return boatDAO.addBoat(boatList);
    }

    @Override
    public ArrayList<BoatDTO> searchBoat(String id) throws Exception {
        return boatDAO.searchBoat(id);
    }

    @Override
    public boolean updateBoat(ArrayList<BoatDTO> boatList) throws Exception {
        return boatDAO.updateBoat(boatList);
    }

    @Override
    public boolean removeList(ArrayList<BoatDTO> boatList) throws Exception {

        return boatDAO.removeList(boatList);
    }

    @Override
    public String getBoatId(String name) throws Exception {

        return boatDAO.getBoatId(name);
    }

    @Override
    public String getBoatName(String id) throws Exception {
        
        return boatDAO.getBoatName(id);
    }
}
   

    
    

