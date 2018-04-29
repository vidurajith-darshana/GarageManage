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
public class ServiceDTO extends SuperDTO{
    
    private String sid;
    private String oid;
    private String service_name;
    private int Price;

    public ServiceDTO() {
    }

    public ServiceDTO(String sid, String oid, String service_name, int Price) {
        this.sid = sid;
        this.oid = oid;
        this.service_name = service_name;
        this.Price = Price;
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

    
}
