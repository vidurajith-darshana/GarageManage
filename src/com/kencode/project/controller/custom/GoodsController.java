/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller.custom;

import com.kencode.project.controller.SuperController;
import com.kencode.project.dto.GoodsDTO;
import java.math.BigDecimal;

/**
 *
 * @author Vidura
 */
public interface GoodsController extends SuperController<GoodsDTO>{
   
    public String getGID(String goods) throws Exception;
    
    public String getGoodName(String gid) throws Exception;
    
    public BigDecimal getUnitPrice(String gid) throws Exception;
}
