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
public class BoatDTO extends SuperDTO{
    
    private String bid;
    private String cid;
    private String boat_name;

    public BoatDTO() {
    }

    public BoatDTO(String bid, String cid, String boat_name) {
        this.bid = bid;
        this.cid = cid;
        this.boat_name = boat_name;
    }

    /**
     * @return the bid
     */
    public String getBid() {
        return bid;
    }

    /**
     * @param bid the bid to set
     */
    public void setBid(String bid) {
        this.bid = bid;
    }

    /**
     * @return the cid
     */
    public String getCid() {
        return cid;
    }

    /**
     * @param cid the cid to set
     */
    public void setCid(String cid) {
        this.cid = cid;
    }

    /**
     * @return the boat_name
     */
    public String getBoat_name() {
        return boat_name;
    }

    /**
     * @param boat_name the boat_name to set
     */
    public void setBoat_name(String boat_name) {
        this.boat_name = boat_name;
    }

    
}
