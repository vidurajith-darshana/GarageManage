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
public class InvoiceDTO extends SuperDTO{
    
    private String oid;
    private String ino;
    private String date;

    public InvoiceDTO() {
    }

    public InvoiceDTO(String oid, String ino, String date) {
        this.oid = oid;
        this.ino = ino;
        this.date = date;
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