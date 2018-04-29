/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dto;

/**
 *
 * @author Vidura
 */
public class GoodsDTO extends SuperDTO{
    
    private String gid;
    private String good_name;
    private int price;
    
    public GoodsDTO() {
    }

    public GoodsDTO(String gid, String good_name, int price) {
        this.gid = gid;
        this.good_name = good_name;
        this.price = price;
    }

    /**
     * @return the gid
     */
    public String getGid() {
        return gid;
    }

    /**
     * @param gid the gid to set
     */
    public void setGid(String gid) {
        this.gid = gid;
    }

    /**
     * @return the good_name
     */
    public String getGood_name() {
        return good_name;
    }

    /**
     * @param good_name the good_name to set
     */
    public void setGood_name(String good_name) {
        this.good_name = good_name;
    }

    /**
     * @return the price
     */
    public int getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(int price) {
        this.price = price;
    }

    
}
