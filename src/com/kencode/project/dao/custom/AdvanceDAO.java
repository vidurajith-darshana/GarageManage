/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.AdvanceDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidurajith
 */
public interface AdvanceDAO extends SuperDAO<AdvanceDTO>{
    
    public boolean addAdvance(AdvanceDTO advance) throws Exception;
    
    public boolean updateAdvance(int advance,String adNo) throws Exception;
    
    public Object[] getAdvance(String invoiceNo) throws Exception;
    
    

    @Override
    public default boolean delete(String id) throws Exception {return true;}

    @Override
    public default ArrayList<AdvanceDTO> getAll() throws Exception {return null;}

    @Override
    public default AdvanceDTO search(String id) throws Exception {return null;}

    @Override
    public default boolean add(AdvanceDTO dto) throws Exception {return true;}

    @Override
    public default boolean update(AdvanceDTO dto) throws Exception {return true;}
    
    
    
    
}
