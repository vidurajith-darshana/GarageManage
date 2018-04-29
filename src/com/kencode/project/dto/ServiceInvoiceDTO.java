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
public class ServiceInvoiceDTO extends SuperDTO{
    
    private String sid;
    private String oid;
    private String bid;
    private String service_name;
    private int Price;
    private String date;

    public ServiceInvoiceDTO() {
    }

    public ServiceInvoiceDTO(String sid, String oid, String bid, String service_name, int Price, String date) {
        this.sid = sid;
        this.oid = oid;
        this.bid = bid;
        this.service_name = service_name;
        this.Price = Price;
        this.date = date;
    }

    /**
     * @return the sid
     */
    public String getSid() {
        return sid;
    }

    /**
     * @param sid the sid to set
     */
    public void setSid(String sid) {
        this.sid = sid;
    }

    /**
     * @return the oid
     */
    public String getOid() {
        return oid;
    }

    /**
     * @param oid the oid to set
     */
    public void setOid(String oid) {
        this.oid = oid;
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
     * @return the service_name
     */
    public String getService_name() {
        return service_name;
    }

    /**
     * @param service_name the service_name to set
     */
    public void setService_name(String service_name) {
        this.service_name = service_name;
    }

    /**
     * @return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
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
