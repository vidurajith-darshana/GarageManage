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
public class CustGoodsDTO extends SuperDTO{
    
    private String cid;
    private String bid;
    private String gid;
    private String ino;
    private int qty;
    private int grandTot;
    private String date;

    public CustGoodsDTO() {
    }

    public CustGoodsDTO(String cid, String bid, String gid, String ino, int qty, int grandTot, String date) {
        this.cid = cid;
        this.bid = bid;
        this.gid = gid;
        this.ino = ino;
        this.qty = qty;
        this.grandTot = grandTot;
        this.date = date;
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
     * @return the ino
     */
    public String getIno() {
        return ino;
    }

    /**
     * @param ino the ino to set
     */
    public void setIno(String ino) {
        this.ino = ino;
    }

    /**
     * @return the qty
     */
    public int getQty() {
        return qty;
    }

    /**
     * @param qty the qty to set
     */
    public void setQty(int qty) {
        this.qty = qty;
    }

    /**
     * @return the grandTot
     */
    public int getGrandTot() {
        return grandTot;
    }

    /**
     * @param grandTot the grandTot to set
     */
    public void setGrandTot(int grandTot) {
        this.grandTot = grandTot;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    
}
