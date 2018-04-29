/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.PasswordDTO;

/**
 *
 * @author Sandun Dilhan
 */
public interface PasswordDAO extends SuperDAO<PasswordDTO>{
    
     public PasswordDTO selectPassword(String password,String name)throws Exception;
    
}
