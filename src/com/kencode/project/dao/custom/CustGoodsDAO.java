/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.custom;

import com.kencode.project.dao.SuperDAO;
import com.kencode.project.dto.CustGoodsDTO;
import java.util.ArrayList;

/**
 *
 * @author Vidura
 */
public interface CustGoodsDAO extends SuperDAO<CustGoodsDTO>{
    
    public ArrayList<CustGoodsDTO> searchInvoice(String id)throws Exception;
    
    public boolean add(ArrayList<CustGoodsDTO> clist) throws Exception ;
}
