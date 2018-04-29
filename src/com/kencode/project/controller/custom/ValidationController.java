/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface ValidationController extends SuperController<SuperDTO>{

    @Override
    public default boolean add(SuperDTO dto) throws Exception {return true;}

    @Override
    public default boolean delete(String id) throws Exception {return true;}

    @Override
    public default ArrayList<SuperDTO> getAll() throws Exception {return null;}

    @Override
    public default SuperDTO search(String id) throws Exception {return null;}

    @Override
    public default boolean update(SuperDTO dto) throws Exception {return true;}
    
    public boolean setNumberFormat(String text) throws Exception;
    
    
}
