/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.controller;

import com.kencode.project.controller.custom.impl.AdvanceControllerImpl;
import com.kencode.project.controller.custom.impl.BackupControllerImpl;
import com.kencode.project.controller.custom.impl.BoatControllerImpl;
import com.kencode.project.controller.custom.impl.CustGoodsControllerImpl;
import com.kencode.project.controller.custom.impl.CustomerControllerImpl;
import com.kencode.project.controller.custom.impl.GoodsControllerImpl;
import com.kencode.project.controller.custom.impl.IdControllerImpl;
import com.kencode.project.controller.custom.impl.InvoiceControllerImpl;
import com.kencode.project.controller.custom.impl.OrderDetailControllerImpl;
import com.kencode.project.controller.custom.impl.OrdersControllerImpl;
import com.kencode.project.controller.custom.impl.PasswordControllerImpl;
import com.kencode.project.controller.custom.impl.QueryControllerImpl;
import com.kencode.project.controller.custom.impl.ServiceControllerImpl;
import com.kencode.project.controller.custom.impl.ServiceInvoiceControllerImpl;
import com.kencode.project.controller.custom.impl.ValidationControllerImpl;

/**
 *
 * @author Vidura
 */
public class ControllerFactory {
    
    private static ControllerFactory controllerFactory;
    
    private ControllerFactory(){
        
    }
    public enum ControllerTypes{
        
        ADVANCE,BOAT,CUSTGOOD,CUSTOMER,GOODS,INVOICE,ORDERDETAIL,ORDERS,SERVICE,QUERY,BACKUP,IDGEN,PASSWORD,VALIDATION,SERVICEINVOICE
    }
    public static ControllerFactory getInstance(){
        if(controllerFactory==null){
            controllerFactory=new ControllerFactory();
        }
        return controllerFactory;
    }
    public SuperController getControllerTypes(ControllerTypes types){
        
        switch(types){
            
            case ADVANCE:
                return new AdvanceControllerImpl();
            case BACKUP:
                return new BackupControllerImpl();
            case CUSTOMER:
                return new CustomerControllerImpl();
            case BOAT:
                return new BoatControllerImpl();
            case CUSTGOOD:
                return new CustGoodsControllerImpl();
            case GOODS:
                return new GoodsControllerImpl();
            case INVOICE:
                return new InvoiceControllerImpl();
            case ORDERS:
                return new OrdersControllerImpl();
            case ORDERDETAIL:
                return new OrderDetailControllerImpl();
            case SERVICE:
                return new ServiceControllerImpl();
            case QUERY:
                return new QueryControllerImpl();
            case IDGEN:
                return new IdControllerImpl();
            case PASSWORD:
                return new PasswordControllerImpl();
            case VALIDATION:
                return new ValidationControllerImpl();
            case SERVICEINVOICE:
                return new ServiceInvoiceControllerImpl();
            default:
                return null;
        }
    }
    
}
