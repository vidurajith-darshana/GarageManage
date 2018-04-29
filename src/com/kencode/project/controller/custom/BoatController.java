/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.BoatDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface BoatController extends SuperController<BoatDTO>{
    
    public boolean addBoat(ArrayList<BoatDTO>boatList)throws Exception;
    
    public ArrayList<BoatDTO> searchBoat(String id)throws Exception;
    
    public boolean updateBoat(ArrayList<BoatDTO>boatList)throws Exception;
    
    public boolean removeList(ArrayList<BoatDTO>boatList) throws Exception;
    
    public String getBoatId(String name) throws Exception;
    
    public String getBoatName(String id) throws Exception;
}
