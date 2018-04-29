/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dto;

/**
 *
 * @author Vidurajith
 */
public class AdvanceDTO extends SuperDTO{
    
    private String adNo;
    private int advance;
    private String invoiceNo;

    public AdvanceDTO() {
    }

    public AdvanceDTO(String adNo, int advance, String invoiceNo) {
        this.adNo = adNo;
        this.advance = advance;
        this.invoiceNo = invoiceNo;
    }

    /**
     * @return the adNo
     */
    public String getAdNo() {
        return adNo;
    }

    /**
     * @param adNo the adNo to set
     */
    public void setAdNo(String adNo) {
        this.adNo = adNo;
    }

    /**
     * @return the advance
     */
    public int getAdvance() {
        return advance;
    }

    /**
     * @param advance the advance to set
     */
    public void setAdvance(int advance) {
        this.advance = advance;
    }

    /**
     * @return the invoiceNo
     */
    public String getInvoiceNo() {
        return invoiceNo;
    }

    /**
     * @param invoiceNo the invoiceNo to set
     */
    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    
}
