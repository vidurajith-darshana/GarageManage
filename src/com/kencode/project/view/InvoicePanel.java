/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.view;

import com.kencode.project.controller.ControllerFactory;
import com.kencode.project.controller.custom.AdvanceController;
import com.kencode.project.controller.custom.BoatController;
import com.kencode.project.controller.custom.CustGoodsContorller;
import com.kencode.project.controller.custom.CustomerController;
import com.kencode.project.controller.custom.GoodsController;
import com.kencode.project.controller.custom.IdController;
import com.kencode.project.controller.custom.InvoiceController;
import com.kencode.project.controller.custom.OrderDetailController;
import com.kencode.project.controller.custom.OrdersController;
import com.kencode.project.controller.custom.ServiceController;
import com.kencode.project.controller.custom.ServiceInvoiceController;
import com.kencode.project.controller.custom.ValidationController;
import com.kencode.project.dao.db.ConnectionFactory;
import com.kencode.project.dto.AdvanceDTO;
import com.kencode.project.dto.BoatDTO;
import com.kencode.project.dto.CustGoodsDTO;
import com.kencode.project.dto.CustomerDTO;
import com.kencode.project.dto.GoodsDTO;
import com.kencode.project.dto.InvoiceDTO;
import com.kencode.project.dto.OrderDetailDTO;
import com.kencode.project.dto.OrdersDTO;
import com.kencode.project.dto.ServiceInvoiceDTO;
import java.awt.Container;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Sandun Dilhan
 */
public class InvoicePanel extends javax.swing.JPanel {
    private int grandAmount=0;
    
    
    private ServiceController ctrlService;
    private GoodsController ctrlGoods;
    private CustomerController ctrlCustomer;
    private BoatController ctrlBoat;
    private IdController ctrlID;
    private CustGoodsContorller ctrlCustGoods;
    private ValidationController ctrlValidation;
    private InvoiceController ctrlInvoice;
    private OrdersController ctrlOrders;
    private OrderDetailController ctrlOrderDetail;
    private ServiceInvoiceController ctrlServiceInvoice;
    private AdvanceController ctrlAdvance;
    
    private Connection conn;
    
    int count=0;
            
    /**
     * Creates new form InvoicePanel
     */
    public InvoicePanel() {
        
        
        initComponents();
        txtAmount.setEditable(false);
        txtInvoiceNo.setEditable(false);
        txtCustId.setEditable(false);
        txtOrder.setEditable(false);
        txtSid.setEditable(false);
        txtItemCode.setEditable(false);
        
        ctrlServiceInvoice=(ServiceInvoiceController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.SERVICEINVOICE);
        ctrlService=(ServiceController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.SERVICE);
        ctrlOrderDetail=(OrderDetailController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.ORDERDETAIL);
        ctrlAdvance=(AdvanceController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.ADVANCE);
        ctrlInvoice=(InvoiceController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.INVOICE);
        ctrlValidation=(ValidationController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.VALIDATION);
        ctrlGoods=(GoodsController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.GOODS);
        ctrlCustomer=(CustomerController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.CUSTOMER);
        ctrlBoat=(BoatController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.BOAT);
        ctrlID=(IdController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.IDGEN);
        ctrlCustGoods=(CustGoodsContorller) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.CUSTGOOD);
        ctrlOrders=(OrdersController) ControllerFactory.getInstance().getControllerTypes(ControllerFactory.ControllerTypes.ORDERS);
        conn=ConnectionFactory.getInstance().getConnection();
        
        loadDescription();
        loadCustomer();
        loadDate();
        genarateServiceID();
        generateOrderId();
        generateInvoiceId();
        
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(false);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtInvoiceNo = new javax.swing.JTextField();
        cmbInvoice = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        cmbCustomerName = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        txtCustId = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cmbDescription = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        txtItemCode = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        txtQty = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtUnitPrice = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnSAdd = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        txtSid = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtSDescription = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtSPrice = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cmbBoat = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        txtOrder = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnSRemove = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoice = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblService = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnSearch = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtAmount = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtAdvance = new javax.swing.JTextField();
        txtBalance = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        txtExtra = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Invoice No.");

        txtInvoiceNo.setBackground(new java.awt.Color(153, 153, 153));

        cmbInvoice.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbInvoiceItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Customer Name");

        cmbCustomerName.setFont(new java.awt.Font("FMAbhaya", 0, 18)); // NOI18N
        cmbCustomerName.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCustomerNameItemStateChanged(evt);
            }
        });
        cmbCustomerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCustomerNameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Cust Id");

        txtCustId.setBackground(new java.awt.Color(153, 153, 153));
        txtCustId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustIdActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Date");

        txtDate.setBackground(new java.awt.Color(153, 153, 153));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Description");

        cmbDescription.setFont(new java.awt.Font("FMAbhaya", 0, 18)); // NOI18N
        cmbDescription.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbDescriptionItemStateChanged(evt);
            }
        });
        cmbDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDescriptionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Item Code");

        txtItemCode.setBackground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("QTY");

        txtQty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQtyActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Unit Price          Rs.");

        txtUnitPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUnitPriceMouseClicked(evt);
            }
        });
        txtUnitPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUnitPriceActionPerformed(evt);
            }
        });

        btnSAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSAdd.setText("ADD");
        btnSAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSAddMouseClicked(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("SID");

        txtSid.setEditable(false);
        txtSid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSidActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("Service Description");

        txtSDescription.setFont(new java.awt.Font("FMAbhaya", 0, 18)); // NOI18N
        txtSDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSDescriptionActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setText("Price          Rs.");

        txtSPrice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSPriceMouseClicked(evt);
            }
        });
        txtSPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSPriceActionPerformed(evt);
            }
        });

        btnAdd.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAdd.setText("ADD");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setText("Boat Name");

        cmbBoat.setFont(new java.awt.Font("FMAbhaya", 0, 18)); // NOI18N
        cmbBoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBoatActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setText("Order ID");

        txtOrder.setEditable(false);
        txtOrder.setBackground(new java.awt.Color(153, 153, 153));
        txtOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOrderActionPerformed(evt);
            }
        });

        btnRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnRemove.setText("REMOVE");
        btnRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRemoveMouseClicked(evt);
            }
        });
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSRemove.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSRemove.setText("REMOVE");
        btnSRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSRemoveMouseClicked(evt);
            }
        });
        btnSRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSDescription))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(120, 120, 120)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtSPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cmbBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(cmbDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(129, 129, 129)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(320, 320, 320)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbBoat, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(txtOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtInvoiceNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cmbInvoice, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmbDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtItemCode, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtQty, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUnitPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        tblInvoice.setFont(new java.awt.Font("FMAbhaya", 0, 18)); // NOI18N
        tblInvoice.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Date", "Boat Name", "Item Code", "Description", "QTY", "Unit Price", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInvoice);
        if (tblInvoice.getColumnModel().getColumnCount() > 0) {
            tblInvoice.getColumnModel().getColumn(1).setPreferredWidth(150);
            tblInvoice.getColumnModel().getColumn(2).setMinWidth(0);
            tblInvoice.getColumnModel().getColumn(2).setPreferredWidth(0);
            tblInvoice.getColumnModel().getColumn(2).setMaxWidth(0);
            tblInvoice.getColumnModel().getColumn(3).setPreferredWidth(250);
        }

        tblService.setFont(new java.awt.Font("FMAbhaya", 0, 18)); // NOI18N
        tblService.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SID", "Date", "Boat Name", "Description", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblService);
        if (tblService.getColumnModel().getColumnCount() > 0) {
            tblService.getColumnModel().getColumn(0).setMinWidth(0);
            tblService.getColumnModel().getColumn(0).setPreferredWidth(0);
            tblService.getColumnModel().getColumn(0).setMaxWidth(0);
            tblService.getColumnModel().getColumn(1).setPreferredWidth(100);
            tblService.getColumnModel().getColumn(3).setPreferredWidth(200);
            tblService.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnUpdate.setText("UPDATE");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Total Amount         Rs.");

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(153, 153, 153));

        btnSave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnRefresh.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnRefresh.setText("Refresh Total");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setText("Advance Payment    Rs.");

        txtAdvance.setBackground(new java.awt.Color(153, 153, 153));
        txtAdvance.setText("0");
        txtAdvance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAdvanceActionPerformed(evt);
            }
        });

        txtBalance.setEditable(false);
        txtBalance.setBackground(new java.awt.Color(153, 153, 153));
        txtBalance.setText("0");
        txtBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBalanceActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setText("Balance    Rs.");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setText("Extra Payment    Rs.");

        txtExtra.setBackground(new java.awt.Color(153, 153, 153));
        txtExtra.setText("0");
        txtExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtExtraActionPerformed(evt);
            }
        });
        txtExtra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtExtraKeyReleased(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDelete.setText("DELETE");
        btnDelete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDeleteMouseClicked(evt);
            }
        });
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAdvance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmbDescriptionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbDescriptionItemStateChanged
        String desc=(String) cmbDescription.getSelectedItem();
        try {
            GoodsDTO goods=ctrlGoods.search(desc);
            txtItemCode.setText(goods.getGid());
            txtUnitPrice.setText(Integer.toString(goods.getPrice()));
        } catch (Exception ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtQty.requestFocus();
        txtQty.selectAll();
        
    }//GEN-LAST:event_cmbDescriptionItemStateChanged

    private void cmbCustomerNameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCustomerNameItemStateChanged
        String name=(String) cmbCustomerName.getSelectedItem();
        try {
            CustomerDTO cust=ctrlCustomer.search(name);
            txtCustId.setText(cust.getCid());
            cmbBoat.removeAllItems();
            loadBoatName();
            cmbInvoice.removeAllItems();
            loadInvoiceId();
        } catch (Exception ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cmbCustomerNameItemStateChanged

    private void cmbCustomerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCustomerNameActionPerformed
        cmbBoat.requestFocus();
    }//GEN-LAST:event_cmbCustomerNameActionPerformed

    private void cmbDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDescriptionActionPerformed
        txtQty.requestFocus();
    }//GEN-LAST:event_cmbDescriptionActionPerformed

    private void txtQtyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQtyActionPerformed
        
        try {
            String text=txtQty.getText();
            if(!ctrlValidation.setNumberFormat(text)){
                JOptionPane.showMessageDialog(this,"You can use only numbers!");
                txtQty.setText("");
            }else{
                txtUnitPrice.requestFocus();
            }
            
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_txtQtyActionPerformed

    private void txtSDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSDescriptionActionPerformed
        txtSPrice.requestFocus();
    }//GEN-LAST:event_txtSDescriptionActionPerformed

    private void txtCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustIdActionPerformed

    private void cmbBoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBoatActionPerformed
        cmbDescription.requestFocus();
    }//GEN-LAST:event_cmbBoatActionPerformed

    private void btnSAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSAddMouseClicked
        try {
            if(ctrlValidation.setNumberFormat(txtSPrice.getText())){
                serviceGrandTotalActoin();
                clearText();
            }else{
               JOptionPane.showMessageDialog(this,"You can use only numbers!");
               txtSPrice.setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSAddMouseClicked

    private void txtSPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSPriceMouseClicked
        serviceGrandTotalActoin();
    }//GEN-LAST:event_txtSPriceMouseClicked

    private void txtSidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSidActionPerformed
        txtSDescription.requestFocus();
    }//GEN-LAST:event_txtSidActionPerformed

    private void txtSPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSPriceActionPerformed
        try {
            if(txtSDescription.getText().equals("")){
                
                JOptionPane.showMessageDialog(this,"You missed some fields.check Again!");
                return;
            }
            if(ctrlValidation.setNumberFormat(txtSPrice.getText())){
                serviceGrandTotalActoin();
                clearText();
                generateSID();
            }else{
               JOptionPane.showMessageDialog(this,"You can use only numbers!");
               txtSPrice.setText("");
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSPriceActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        try {
            if(ctrlValidation.setNumberFormat(txtUnitPrice.getText())){
                grandAmountAction();
                txtQty.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"You can use only numbers!");
                txtUnitPrice.setText("");
                
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtUnitPriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUnitPriceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUnitPriceMouseClicked

    private void txtUnitPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUnitPriceActionPerformed
        try {
            if(ctrlValidation.setNumberFormat(txtUnitPrice.getText())){
                grandAmountAction();
                txtQty.setText("");
            }else{
                JOptionPane.showMessageDialog(this,"You can use only numbers!");
                txtUnitPrice.setText("");
                
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtUnitPriceActionPerformed

    private void txtOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOrderActionPerformed

    private void cmbInvoiceItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbInvoiceItemStateChanged
       
    }//GEN-LAST:event_cmbInvoiceItemStateChanged

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
       
        if(advanceAction()){
            try {
                DecimalFormat df=new DecimalFormat("#,###.00");
                df.setMaximumFractionDigits(2);

                DecimalFormat dfd=new DecimalFormat("#");
                dfd.setMaximumFractionDigits(2);

                String invoice=txtInvoiceNo.getText();
                String oid=txtOrder.getText();

                ArrayList<OrderDetailDTO> detailList=new ArrayList<>();
                ArrayList<ServiceInvoiceDTO> serviceList=new ArrayList<>();
                ArrayList<CustGoodsDTO> custList=new ArrayList<>();

                OrdersDTO o=new OrdersDTO(oid, Integer.parseInt(dfd.format(df.parse(txtAmount.getText()))), txtDate.getText());
                InvoiceDTO in=new InvoiceDTO(txtOrder.getText(), txtInvoiceNo.getText(), txtDate.getText());

                int count=0; 
                DefaultTableModel dtmInvoice=(DefaultTableModel) tblInvoice.getModel();
                for (int i=0;i<dtmInvoice.getRowCount();i++) {
                    count++;
                    OrderDetailDTO order=new OrderDetailDTO(oid, (String)dtmInvoice.getValueAt(i, 2), (int) dtmInvoice.getValueAt(i, 4),count);
                    detailList.add(order);
                    //System.out.println(dfd.format(df.parse((String) dtmInvoice.getValueAt(i, 6))));
                    CustGoodsDTO cust=new CustGoodsDTO(txtCustId.getText(), ctrlBoat.getBoatId((String) dtmInvoice.getValueAt(i, 1)), (String) dtmInvoice.getValueAt(i, 2), txtInvoiceNo.getText(), (int) dtmInvoice.getValueAt(i, 4), Integer.parseInt(dfd.format(df.parse((String)dtmInvoice.getValueAt(i, 6)))), txtDate.getText());
                    System.out.println(ctrlBoat.getBoatId((String) dtmInvoice.getValueAt(i, 1)));
                    custList.add(cust);
                }

                DefaultTableModel dtmService=(DefaultTableModel) tblService.getModel();
                for(int i=0;i<dtmService.getRowCount();i++){

                    String bid=ctrlBoat.getBoatId((String) dtmService.getValueAt(i, 2));
                    ServiceInvoiceDTO service=new ServiceInvoiceDTO((String)dtmService.getValueAt(i, 0), txtOrder.getText(), bid,(String)dtmService.getValueAt(i, 3), Integer.parseInt(dfd.format(df.parse((String) dtmService.getValueAt(i, 4)))),(String)dtmService.getValueAt(i, 1));
                    serviceList.add(service);
                }

                if(dtmService.getRowCount()==0){

                    boolean isAdd=ctrlOrders.add(o,in, detailList, custList);
                    if(isAdd){
                        JOptionPane.showMessageDialog(this,"Save Success!");
                        jasperReportOrderBill1();
                        dtmInvoice.setRowCount(0);
                        generateInvoiceId();
                        generateOrderId();
                        clearText();
                        txtAmount.setText("");
                        grandAmount=0;
                    }else{
                        JOptionPane.showMessageDialog(this,"Save Failed!");
                        dtmInvoice.setRowCount(0);
                        clearText();
                        txtAmount.setText("");
                    }
                }else{
                    System.out.println("deede");
                    boolean isAdd=ctrlOrders.add(o,in, detailList, serviceList, custList);
                    System.out.println(isAdd);
                    if(isAdd){
                        JOptionPane.showMessageDialog(this,"Save Success!");
                        jasperReportOrderBill2();
                        jasperReportOrderBill1();
                        dtmInvoice.setRowCount(0);
                        dtmService.setRowCount(0);
                        generateInvoiceId();
                        genarateServiceID();
                        generateOrderId();
                        clearText();
                        txtAmount.setText("");
                        grandAmount=0;
                    }else{
                        JOptionPane.showMessageDialog(this,"Save Failed!");
                        dtmInvoice.setRowCount(0);
                        dtmService.setRowCount(0);
                        clearText();
                        txtAmount.setText("");
                    }

                }

            } catch (Exception ex) {

                JOptionPane.showMessageDialog(this,"You have an error!");  
            }
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        
        
        btnSave.setEnabled(false);
        btnUpdate.setEnabled(true);
        
        DecimalFormat df=new DecimalFormat("#,###.00");
        df.setMaximumFractionDigits(2);
        
        try {
            
            clearText();
            DefaultTableModel dtmInvoice=(DefaultTableModel) tblInvoice.getModel();
            DefaultTableModel dtmService=(DefaultTableModel) tblService.getModel();
            
            dtmInvoice.setRowCount(0);
            dtmService.setRowCount(0);
            
            String invoice=cmbInvoice.getSelectedItem().toString();
            String oid=null;
            ArrayList<InvoiceDTO> ilist=ctrlInvoice.getAll();
            for (InvoiceDTO invoiceDTO : ilist) {
                if(invoiceDTO.getIno().equals(invoice)){
                    oid=invoiceDTO.getOid();
                }
            }
            
            ArrayList<OrderDetailDTO> orderDetail=ctrlOrderDetail.getAll();
            
            String boat=null;
            String itemcode=null;
            String date=null;
            String item=null;
            int qty=0;
            String unitPrice=null;
            String amount=null;
            String sid=null;
            String serviceName=null;
            String sDate=null;
            String sBoat=null;
            String price=null;
            
            for (InvoiceDTO invoiceDTO: ctrlInvoice.getAll()) {
                if(invoiceDTO.getOid().equals(oid)){
                    ArrayList<CustGoodsDTO> clist=ctrlCustGoods.getAll();
                    for (CustGoodsDTO custGoodsDTO : clist) {
                        if(invoiceDTO.getIno().equals(custGoodsDTO.getIno())){
                            
                            date=custGoodsDTO.getDate();
                            itemcode=custGoodsDTO.getGid();
                            qty=custGoodsDTO.getQty();
                            amount=df.format(custGoodsDTO.getGrandTot());
                            
                            boat=ctrlBoat.getBoatName(custGoodsDTO.getBid());
                            item=ctrlGoods.getGoodName(custGoodsDTO.getGid());
                            unitPrice=df.format(ctrlGoods.getUnitPrice(custGoodsDTO.getGid()));
                            
                            Object[] invoiceRow={date,boat,itemcode,item,qty,unitPrice,amount};
                            dtmInvoice.addRow(invoiceRow);
                              
                        }
                        
                    }
                    
                }
                
            }
            ArrayList<ServiceInvoiceDTO> slist=ctrlServiceInvoice.getAll();
            for (ServiceInvoiceDTO serviceDTO : slist) {
                if(serviceDTO.getOid().equals(oid)){
                    sid=serviceDTO.getSid();
                    sDate=serviceDTO.getDate();
                    sBoat=ctrlBoat.getBoatName(serviceDTO.getBid());
                    serviceName=serviceDTO.getService_name();
                    price=df.format(serviceDTO.getPrice());

                    Object[] serviceRow={sid,sDate,sBoat,serviceName,price};
                    dtmService.addRow(serviceRow);

                }

            }
            
           ArrayList<OrdersDTO> olist=ctrlOrders.getAll();
            for (OrdersDTO ordersDTO : olist) {
                if(oid.equals(ordersDTO.getOid())){
                    txtAmount.setText(df.format(ordersDTO.getAmount()));
                    grandAmount=0;
                    grandAmount=ordersDTO.getAmount();
                }
            }
            
            String invoiceNumber=cmbInvoice.getSelectedItem().toString();
            Object[] advance=ctrlAdvance.getAdvance(invoice);
            if(advance!=null){
                txtAdvance.setText((Integer.toString((int)advance[0])));
            }else{
                txtAdvance.setText("0");
            }
            setBalance();
            
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"You have not invoices to select!");
        }

    }//GEN-LAST:event_btnSearchActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
           
        try {
            String invoiceNo=cmbInvoice.getSelectedItem().toString();
            String oid=null;
            String date=null;
            ArrayList<InvoiceDTO> list=ctrlInvoice.getAll();
            for (InvoiceDTO invoiceDTO : list) {
                if(invoiceDTO.getIno().equals(invoiceNo)){
                    oid=invoiceDTO.getOid();
                }
            }
            ArrayList<OrdersDTO> olist=ctrlOrders.getAll();
            for (OrdersDTO order : olist) {
                if(oid.equals(order.getOid())){
                    date=order.getDate();
                }
            }

            Boolean isOrder=ctrlOrders.deleteOrder(oid);
            if(isOrder){
                try {
                    DecimalFormat df=new DecimalFormat("#,###.00");
                    df.setMaximumFractionDigits(2);

                    DecimalFormat dfd=new DecimalFormat("#");
                    dfd.setMaximumFractionDigits(2);

                    ArrayList<OrderDetailDTO> detailList=new ArrayList<>();
                    ArrayList<ServiceInvoiceDTO> serviceList=new ArrayList<>();
                    ArrayList<CustGoodsDTO> custList=new ArrayList<>();

                    OrdersDTO o=new OrdersDTO(oid, Integer.parseInt(dfd.format(df.parse(txtAmount.getText()))), date);
                    InvoiceDTO in=new InvoiceDTO(oid, invoiceNo, txtDate.getText());

                    int count=ctrlOrderDetail.getCount(oid);
                    DefaultTableModel dtmInvoice=(DefaultTableModel) tblInvoice.getModel();
                    for (int i=0;i<dtmInvoice.getRowCount();i++) {
                        count++;
                        OrderDetailDTO order=new OrderDetailDTO(oid, (String)dtmInvoice.getValueAt(i, 2), (int) dtmInvoice.getValueAt(i, 4),count);
                        detailList.add(order);

                        CustGoodsDTO cust=new CustGoodsDTO(txtCustId.getText(), ctrlBoat.getBoatId((String) dtmInvoice.getValueAt(i, 1)), (String) dtmInvoice.getValueAt(i, 2), invoiceNo, (int) dtmInvoice.getValueAt(i, 4), Integer.parseInt(dfd.format(df.parse((String) dtmInvoice.getValueAt(i, 6)))), (String) dtmInvoice.getValueAt(i,0 ));
                        custList.add(cust);
                    }

                    DefaultTableModel dtmService=(DefaultTableModel) tblService.getModel();
                    for(int i=0;i<dtmService.getRowCount();i++){
                        String bid=ctrlBoat.getBoatId((String) dtmService.getValueAt(i, 2));
                        ServiceInvoiceDTO service=new ServiceInvoiceDTO((String)dtmService.getValueAt(i, 0), oid, bid,(String)dtmService.getValueAt(i, 3), Integer.parseInt(dfd.format(df.parse((String) dtmService.getValueAt(i, 4)))),(String)dtmService.getValueAt(i, 1));
                        serviceList.add(service);
                    }

                    if(dtmService.getRowCount()==0){

                        boolean isAdd=ctrlOrders.add(o,in, detailList, custList);
                        if(isAdd){
                            JOptionPane.showMessageDialog(this,"Update Success!");

                            jasperReportOrderBill3();
                            dtmInvoice.setRowCount(0);
                            generateInvoiceId();
                            generateOrderId();
                            clearText();
                        }else{
                            JOptionPane.showMessageDialog(this,"Update Failed!");
                            dtmInvoice.setRowCount(0);
                            clearText();
                        }
                    }else{
                        boolean isAdd=ctrlOrders.add(o,in, detailList, serviceList, custList);
                        if(isAdd){
                            JOptionPane.showMessageDialog(this,"Update Success!");
                            jasperReportOrderBill4();
                            jasperReportOrderBill3();
                            dtmInvoice.setRowCount(0);
                            dtmService.setRowCount(0);
                            generateInvoiceId();
                            genarateServiceID();
                            generateOrderId();
                            clearText();
                        }else{
                            JOptionPane.showMessageDialog(this,"Update Failed!");
                            dtmInvoice.setRowCount(0);
                            dtmService.setRowCount(0);
                            clearText();
                        }
                    }
                } catch (Exception ex) {
                    Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex); 
                 // JOptionPane.showMessageDialog(this,"You have an error!");  
                }

            }else{
            JOptionPane.showMessageDialog(this,"Update Failed!");
            }
            
            if(!txtAdvance.getText().equals("0")){
                String advance=txtAdvance.getText();
                boolean b=ctrlValidation.setNumberFormat(advance);
                if(b){
                    
                    AdvanceDTO advanced=new AdvanceDTO(ctrlID.getNewIDFor2ndDB("advance", "ad_no","AD",3),Integer.parseInt(txtAdvance.getText()),cmbInvoice.getSelectedItem().toString());
                    boolean isUpdate=ctrlAdvance.addAdvance(advanced);
                    if(isUpdate){
                        JOptionPane.showMessageDialog(this,"Advance Payment is updated!");
                    }
                     
                }else{
                    JOptionPane.showMessageDialog(this,"Advance Payment is not added to the system!");
                }
                
            }else{
                txtAdvance.setText("0");
            }
            

        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex); 
            JOptionPane.showMessageDialog(this,"You have an error!");
        }
        
        btnUpdate.setEnabled(false);
        btnSave.setEnabled(true);


    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRemoveMouseClicked
                
        try {
            DecimalFormat df =new DecimalFormat("#,###.00");
            df.setMaximumFractionDigits(2);
            
            DecimalFormat dfd =new DecimalFormat("#");
            dfd.setMaximumFractionDigits(2);
            
            DefaultTableModel dtm=(DefaultTableModel) tblInvoice.getModel();
            
            int price=Integer.parseInt(dfd.format(df.parse((String) dtm.getValueAt(tblInvoice.getSelectedRow(), 6)))) ;
            dtm.removeRow(tblInvoice.getSelectedRow());
            int total=Integer.parseInt(dfd.format(df.parse(txtAmount.getText())));
            total=total-price;
            grandAmount=total;
            txtAmount.setText(df.format(total));
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,"Please select a row!");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveMouseClicked

    private void btnSRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSRemoveMouseClicked
               
        try {
            DecimalFormat df =new DecimalFormat("#,###.00");
            df.setMaximumFractionDigits(2);
            
            DecimalFormat dfd =new DecimalFormat("#");
            dfd.setMaximumFractionDigits(2);
            
            DefaultTableModel dtm=(DefaultTableModel) tblService.getModel();
            int price=Integer.parseInt(dfd.format(df.parse((String) dtm.getValueAt(tblService.getSelectedRow(), 4)))) ;
            dtm.removeRow(tblService.getSelectedRow());
            int total=Integer.parseInt(dfd.format(df.parse(txtAmount.getText())));
            total=total-(price);
            grandAmount=total;
            txtAmount.setText(df.format(total));
            
        } catch (Exception ex) {
           JOptionPane.showMessageDialog(this,"Please select a row!");
           //Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btnSRemoveMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
                // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSRemoveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSRemoveActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
      
        count++;
        try {
            DecimalFormat df =new DecimalFormat("#,###.00");
            df.setMaximumFractionDigits(2);
            
            DecimalFormat dfd =new DecimalFormat("#");
            dfd.setMaximumFractionDigits(2);
        
            DefaultTableModel dtmInvoice=(DefaultTableModel) tblInvoice.getModel();
            DefaultTableModel dtmSerivce=(DefaultTableModel) tblService.getModel();

            int total=0;
            for(int i=0;i<dtmInvoice.getRowCount();i++){

                total+=Integer.parseInt(dfd.format(df.parse((String)dtmInvoice.getValueAt(i,6))));

            }
            for(int i=0;i<dtmSerivce.getRowCount();i++){

                total+=Integer.parseInt(dfd.format(df.parse((String)dtmSerivce.getValueAt(i,4))));

            }
            txtAmount.setText(df.format(total));
        } catch (ParseException ex) {
           Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
       }
       if(count==7){
           btnSave.setEnabled(true);
       }
       
       if(Integer.parseInt(txtExtra.getText())>0){
           
           txtAdvance.setText(Integer.toString(Integer.parseInt(txtAdvance.getText())+Integer.parseInt(txtExtra.getText())));
       }
       
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void txtAdvanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAdvanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAdvanceActionPerformed

    private void txtBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBalanceActionPerformed

    private void txtExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtExtraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtExtraActionPerformed

    private void txtExtraKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtExtraKeyReleased
         
        
    }//GEN-LAST:event_txtExtraKeyReleased

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
 
        String invoice=cmbInvoice.getSelectedItem().toString();
        String oid=null;
            ArrayList<InvoiceDTO> ilist;
        try {
            ilist = ctrlInvoice.getAll();
             for (InvoiceDTO invoiceDTO : ilist) {
                if(invoiceDTO.getIno().equals(invoice)){
                    oid=invoiceDTO.getOid();
                }
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            DefaultTableModel dtmInvoice=(DefaultTableModel) tblInvoice.getModel();
            DefaultTableModel dtmService=(DefaultTableModel) tblService.getModel();
            boolean isDeletedOder=ctrlOrders.deleteOrder(oid);
            if(isDeletedOder){
                JOptionPane.showMessageDialog(this,"order has been successfully Deleted...!");
                dtmInvoice.setRowCount(0);
                dtmService.setRowCount(0);
            }else{
                JOptionPane.showMessageDialog(this,"order has not been Deleted...!");
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDeleteMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSAdd;
    private javax.swing.JButton btnSRemove;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cmbBoat;
    private javax.swing.JComboBox cmbCustomerName;
    private javax.swing.JComboBox cmbDescription;
    private javax.swing.JComboBox cmbInvoice;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblInvoice;
    private javax.swing.JTable tblService;
    private javax.swing.JTextField txtAdvance;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtBalance;
    private javax.swing.JTextField txtCustId;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtExtra;
    private javax.swing.JTextField txtInvoiceNo;
    private javax.swing.JTextField txtItemCode;
    private javax.swing.JTextField txtOrder;
    private javax.swing.JTextField txtQty;
    private javax.swing.JTextField txtSDescription;
    private javax.swing.JTextField txtSPrice;
    private javax.swing.JTextField txtSid;
    private javax.swing.JTextField txtUnitPrice;
    // End of variables declaration//GEN-END:variables

     private void loadDescription(){
        try {
            ArrayList<GoodsDTO>goodsList=ctrlGoods.getAll();
            for (int i=0;i<goodsList.size();i++) {
                GoodsDTO goods=goodsList.get(i);
                cmbDescription.addItem(goods.getGood_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void loadCustomer(){
        try {
            ArrayList<CustomerDTO>customerList=ctrlCustomer.getAll();
            for (int i=0;i<customerList.size();i++) {
                CustomerDTO customer=customerList.get(i);
                cmbCustomerName.addItem(customer.getCust_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     private void loadDate(){
        Date d1=new Date();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
        String formatDate=df.format(d1);
        txtDate.setText(formatDate);
    }
     private void loadBoatName(){
         String id=txtCustId.getText();
        try {
            ArrayList<BoatDTO>boatList=ctrlBoat.searchBoat(id);
            for (int i=0;i<boatList.size();i++) {
                BoatDTO boat=boatList.get(i);
                cmbBoat.addItem(boat.getBoat_name());
            }
        } catch (Exception ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void serviceGrandTotalActoin(){
        
        try{ 
            DecimalFormat df=new DecimalFormat("#,###.00");
            df.setMaximumFractionDigits(2);
            DecimalFormat dfd=new DecimalFormat("#");
            dfd.setMaximumFractionDigits(2);

            String sID=txtSid.getText();
            String sDescription=txtSDescription.getText();
            String date=txtDate.getText();
            String boat=cmbBoat.getSelectedItem().toString();
            int sPrice=Integer.parseInt(txtSPrice.getText());

            DefaultTableModel dtm=(DefaultTableModel) tblService.getModel();
            
            if(txtAmount.getText().equals("")){
                grandAmount=grandAmount+sPrice;
                txtAmount.setText(df.format(grandAmount));
            }else{
                int total=Integer.parseInt(dfd.format(df.parse(txtAmount.getText())));
                System.out.println(total);
                int grandTotal=total+Integer.parseInt(txtSPrice.getText());
                txtAmount.setText(df.format(grandTotal));
              //  System.out.println(df.format(grandTotal));
            }
            

            String grandTotal=df.format(sPrice);
            Object[]rowData={sID,date,boat,sDescription,grandTotal};
            dtm.addRow(rowData);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"You missed some fields!");
            
        }
     }
      private void genarateServiceID() {
        
        try {
            String id=ctrlID.getNewID("service_invoice", "sid", "SV", 3);
            txtSid.setText(id);
        } catch (Exception ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
      private void clearText(){
          txtSDescription.setText("");
          txtSPrice.setText("");
          
      }
       private void grandAmountAction(){
        
        try{   
            DecimalFormat df=new DecimalFormat("#,###.00");
            df.setMaximumFractionDigits(2);
            DecimalFormat dfd=new DecimalFormat("#");
            dfd.setMaximumFractionDigits(2);

            String code=txtItemCode.getText();
            String date=txtDate.getText();
            String boatName=(String) cmbBoat.getSelectedItem();
            String description=(String) cmbDescription.getSelectedItem();
            int orderQty=Integer.parseInt(txtQty.getText());
            int unitprice=Integer.parseInt(txtUnitPrice.getText());
            String unitPrice=df.format(unitprice);

            DefaultTableModel dtm=(DefaultTableModel) tblInvoice.getModel();

            for(int i=0;i<dtm.getRowCount();i++){
                String itemCode=(String) dtm.getValueAt(i, 2);
                String desc=(String) dtm.getValueAt(i, 3);
                String date1=(String) dtm.getValueAt(i, 0);
                String boat=(String) dtm.getValueAt(i, 1);
                if( date1.equals(date) && boat.equals(boatName) && itemCode.equals(code) && desc.equals(description)){
                    try {
                        int qty=(int) dtm.getValueAt(i, 4);
                        
                        int tempTotal=Integer.parseInt(dfd.format(df.parse((String) dtm.getValueAt(i, 6))));
                        orderQty+=qty;
                        grandAmount=grandAmount-tempTotal;
                        txtAmount.setText(df.format(grandAmount));
                        dtm.removeRow(i);
                    } catch (ParseException ex) {
                        Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
            int grandTot=orderQty*(unitprice);
            grandAmount=grandAmount+ grandTot;
            txtAmount.setText(df.format(grandAmount));

            String grandTotal=df.format(grandTot);
            Object[] rowData={date,boatName,code,description,orderQty,unitPrice,grandTotal};
            dtm.addRow(rowData);
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this,"You must enter the quantity!");
        }
    }
       private void loadInvoiceId(){
           String id=txtCustId.getText();
        try {
            ArrayList<CustGoodsDTO>custList=ctrlCustGoods.searchInvoice(id);
             for (int i=0;i<custList.size();i++) {
                CustGoodsDTO cust=custList.get(i);
                cmbInvoice.addItem(cust.getIno());
            }
        } catch (Exception ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
       }

    private void generateInvoiceId() {
        
        try {
            txtInvoiceNo.setText(ctrlID.getNewID("invoice", "ino","IN",3));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    private void generateOrderId() {

        try {
            txtOrder.setText(ctrlID.getNewID("orders", "oid","OD",3));
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void generateSID() {
        
        String batch=txtSid.getText();
        
        char[] batchArr=batch.toCharArray();

        if(batchArr[2]=='0' && batchArr[3]=='0' && batchArr[4]=='0' && batchArr[5]=='9'){
            txtSid.setText("SV0010");
            return;
        }else if(batchArr[2]=='0' && batchArr[3]=='0' && batchArr[4]=='9' && batchArr[5]=='9'){
            txtSid.setText("SV0100");
            return;
        }else if(batchArr[2]=='0' && batchArr[3]=='9' && batchArr[4]=='9' && batchArr[5]=='9' && batchArr.length==6){
            txtSid.setText("SV1000");
            return;
        }else if(batchArr[2]=='9' && batchArr[3]=='9' && batchArr[4]=='9' && batchArr[5]=='9' && batchArr.length==6){
            txtSid.setText("SV10000");
            return;
        }else if(batchArr[2]=='9' && batchArr[3]=='9' && batchArr[4]=='9' && batchArr[5]=='9' && batchArr[6]=='9' && batchArr.length==7){
            txtSid.setText("SV100000");
            return;
        }else if(batchArr[2]=='9' && batchArr[3]=='9' && batchArr[4]=='9' && batchArr[5]=='9' && batchArr[6]=='9' && batchArr[7]=='9' && batchArr.length==8){
            txtSid.setText("SV1000000");
            return;
        }
        if(batchArr[2]=='0' && batchArr[3]=='0' && batchArr[4]=='0' &&  batchArr[5]<'9'){

           int batchNo=Integer.parseInt(batchArr[5]+"")+1;
           txtSid.setText("SV000"+Integer.toString(batchNo));

        }else{
            String batchNo="";
            for(int i=2;i<batchArr.length;i++){
                batchNo=batchNo+(batchArr[i]+"");
            }
            int nextNo=Integer.parseInt(batchNo)+1;

            char[] num=Integer.toString(nextNo).toCharArray();
            if(num.length==2){

                txtSid.setText("SV00"+nextNo);
            }else if(num.length==3){

                txtSid.setText("SV0"+nextNo);
            }else if(num.length>3){

                txtSid.setText("SV"+nextNo);
            }
        }
    }
     private void jasperReportOrderBill1(){
         try {
            JasperReport main=(JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/com/kencode/project/controller/jasper/reports/Invice_order.jasper"));
            
            HashMap<String,Object> parameters=new HashMap<>();
            System.out.println(txtInvoiceNo.getText()+"gdfg");
            parameters.put("InvoiceId",txtInvoiceNo.getText());

            JasperPrint fill=JasperFillManager.fillReport(main, parameters,conn);
            
            JasperViewer view=new JasperViewer(fill);
             JDialog dialog=new JDialog();
             Container container=view.getContentPane();
             dialog.setContentPane(container);
             dialog.setSize(view.getSize());
             dialog.setVisible(true);
           

            } catch (JRException ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
      private void jasperReportOrderBill2(){
         try {
            JasperReport main=(JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/com/kencode/project/controller/jasper/reports/invoice_service.jasper"));
            
            HashMap<String,Object> parameters=new HashMap<>();
            System.out.println(txtInvoiceNo.getText()+"gdfg");
            parameters.put("Invoice_no",txtInvoiceNo.getText());

            JasperPrint fill=JasperFillManager.fillReport(main, parameters,conn);
            
            
            JasperViewer view=new JasperViewer(fill);
             JDialog dialog=new JDialog();
             Container container=view.getContentPane();
             dialog.setContentPane(container);
             dialog.setSize(view.getSize());
             dialog.setVisible(true);
           

            } catch (JRException ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private void jasperReportOrderBill3() {
        try {
            JasperReport main=(JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/com/kencode/project/controller/jasper/reports/Invice_order.jasper"));
            
            HashMap<String,Object> parameters=new HashMap<>();
           // System.out.println(txtInvoiceNo.getText()+"gdfg");
            parameters.put("InvoiceId",cmbInvoice.getSelectedItem());

            JasperPrint fill=JasperFillManager.fillReport(main, parameters,conn);
            
            JasperViewer view=new JasperViewer(fill);
             JDialog dialog=new JDialog();
             Container container=view.getContentPane();
             dialog.setContentPane(container);
             dialog.setSize(view.getSize());
             dialog.setVisible(true);
           

            } catch (JRException ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private void jasperReportOrderBill4() {
         try {
            JasperReport main=(JasperReport) JRLoader.loadObject(StartUp.class.getResourceAsStream("/com/kencode/project/controller/jasper/reports/invoice_service.jasper"));
            
            HashMap<String,Object> parameters=new HashMap<>();
          //  System.out.println(txtInvoiceNo.getText()+"gdfg");
            parameters.put("Invoice_no",cmbInvoice.getSelectedItem());

            JasperPrint fill=JasperFillManager.fillReport(main, parameters,conn);
            
            
            JasperViewer view=new JasperViewer(fill);
             JDialog dialog=new JDialog();
             Container container=view.getContentPane();
             dialog.setContentPane(container);
             dialog.setSize(view.getSize());
             dialog.setVisible(true);
           

            } catch (JRException ex) {
            Logger.getLogger(GinPanel.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    private boolean advanceAction() {
       
        AdvanceDTO advance=null;
        try {
            advance = new AdvanceDTO(ctrlID.getNewIDFor2ndDB("advance", "ad_no","AD",3), Integer.parseInt(txtAdvance.getText()), txtInvoiceNo.getText());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            if(!txtAdvance.getText().equals("")){
                if(ctrlValidation.setNumberFormat(txtAdvance.getText())){
                    boolean isAdd=ctrlAdvance.addAdvance(advance);
                    if(isAdd){
                        JOptionPane.showMessageDialog(this,"Advance Payment Added to the System!");
                        return true;
                    }else{
                        JOptionPane.showMessageDialog(this,"Advance Payment Added Failed!");
                        return false;
                    }
                }else{
                    JOptionPane.showMessageDialog(this,"You can use only numbers!");
                    return false;
                }
            }
           
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this,"You have an error!");
            
        }
        return true;
    }
    private void setBalance(){
        
        try {
            DecimalFormat df=new DecimalFormat("#,###.00");
            df.setMaximumFractionDigits(2);
            DecimalFormat dfd=new DecimalFormat("#");
            dfd.setMaximumFractionDigits(2);
             
            if(Integer.parseInt(txtAdvance.getText())>0 && Integer.parseInt(dfd.format(df.parse(txtAmount.getText())))>0){
                txtBalance.setText(df.format(dfd.parse(Integer.toString(Integer.parseInt(dfd.format(df.parse(txtAmount.getText())))-Integer.parseInt(txtAdvance.getText())))));
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(InvoicePanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    private void deletedInvoice(){
        String invoiceId=(String) cmbInvoice.getSelectedItem();
        System.out.println("Invoice"+invoiceId);       
        try {
            boolean isDeleted=ctrlInvoice.deleteInvoice(invoiceId);
            System.out.println("Invoice has been successfully Deleted"+isDeleted);
            if(isDeleted){
                JOptionPane.showMessageDialog(this,"Invoice has been successfully Deleted...!");
                
            }else{
                JOptionPane.showMessageDialog(this,"Invoice has not been Deleted...!");
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
