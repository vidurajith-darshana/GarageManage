/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao;

import com.kencode.project.dao.custom.impl.AdvanceDAOImpl;
import com.kencode.project.dao.custom.impl.BackupDAOImpl;
import com.kencode.project.dao.custom.impl.BoatDAOImpl;
import com.kencode.project.dao.custom.impl.CustGoodDAOImpl;
import com.kencode.project.dao.custom.impl.CustomerDAOImpl;
import com.kencode.project.dao.custom.impl.GoodsDAOImpl;
import com.kencode.project.dao.custom.impl.IdDAOImpl;
import com.kencode.project.dao.custom.impl.InvoiceDAOImpl;
import com.kencode.project.dao.custom.impl.OrderDetailDAOImpl;
import com.kencode.project.dao.custom.impl.OrdersDAOImpl;
import com.kencode.project.dao.custom.impl.PasswordDAOImpl;
import com.kencode.project.dao.custom.impl.QueryDAOImpl;
import com.kencode.project.dao.custom.impl.ServiceDAOImpl;
import com.kencode.project.dao.custom.impl.ServiceInvoiceDAOImpl;

/**
 *
 * @author Vidura
 */
public class DaoFactory {
    
    private static DaoFactory daoFactory;

    private DaoFactory() {
    }
    public enum DAOTypes{
        ADVANCE,BOAT,CUSTGOOD,CUSTOMER,GOODS,INVOICE,ORDERDETAIL,ORDERS,SERVICE,QUERY,BACKUP,IDGEN,PASSWORD,SERVICEINVOICE
    }
    
    public static DaoFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DaoFactory();
        }
        return daoFactory;
    }
    public SuperDAO getDaoTypes(DAOTypes types){
        
        switch(types){
            
            case ADVANCE:
                return new AdvanceDAOImpl();
            case BACKUP:
                return new BackupDAOImpl();
            case CUSTOMER:
                return new CustomerDAOImpl();
            case BOAT:
                return new BoatDAOImpl();
            case CUSTGOOD:
                return new CustGoodDAOImpl();
            case GOODS:
                return new GoodsDAOImpl();
            case INVOICE:
                return new InvoiceDAOImpl();
            case ORDERDETAIL:
                return new OrderDetailDAOImpl();
            case ORDERS:
                return new OrdersDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            case SERVICE:
                return new ServiceDAOImpl();
            case IDGEN:
                return new IdDAOImpl();
            case PASSWORD:
                return new PasswordDAOImpl();
            case SERVICEINVOICE:
                return new ServiceInvoiceDAOImpl();
            default:
                return null;
        }
    }
}
