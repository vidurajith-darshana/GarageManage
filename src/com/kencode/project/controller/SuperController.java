/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller;

import com.kencode.project.dto.SuperDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface SuperController<T extends SuperDTO> {
    
    public ArrayList<T> getAll() throws Exception;
    
    public T search(String id)throws Exception;
    
    public boolean add(T dto)throws Exception;
    
    public boolean delete(String id)throws Exception;
    
    public boolean update(T dto)throws Exception;
}
