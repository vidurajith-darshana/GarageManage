/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kencode.project.dao.db;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vidura
 */
public class ConnectionFactory {
    
    private Connection connection;
    private static ConnectionFactory connectionFactory;

    private ConnectionFactory() {
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            Properties dbProperties=new Properties();
            File dbFile=new File("Settings/dbProperties.properties");
            FileReader dbFileReader;
            dbFileReader = new FileReader(dbFile);
            
            dbProperties.load(dbFileReader);
            
            
            String url="jdbc:mysql://"
                    +dbProperties.getProperty("ip")
                    +"/"
                    +dbProperties.getProperty("database");
                   
            String root=dbProperties.getProperty("userName");
            String password=dbProperties.getProperty("password");
            
            connection=DriverManager.getConnection(url,root,password); 
            
        } catch (ClassNotFoundException | SQLException | IOException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Connection getConnection(){
        return connection;
    }
    public static ConnectionFactory getInstance(){
        if(connectionFactory==null){
            connectionFactory=new ConnectionFactory();
        }
        return connectionFactory;
    }
    
}
