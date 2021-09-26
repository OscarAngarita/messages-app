/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class MyConnection {
    
    private static Connection myConnectionSingleton;
    
    public Connection get_connection(){
//        Connection connection = null;
        if(myConnectionSingleton == null) {
            String dataBase = "mensajes_app"; //Nombre elegido de la db
            String user = "root"; //por defecto en Xammp es root
            String password = ""; //Por defecto viene vacia
            String hosting = "localhost"; //En local
            String port = "3306"; //Puerto común en MySQL
        
            String connectionUrl = "jdbc:mysql://" + hosting + ":" + port + "/" + dataBase + "?useSSL=false";
            
            try{
                myConnectionSingleton = DriverManager.getConnection(connectionUrl, user, password);
            } catch(SQLException e){
                System.out.println(e);
            }
        }
        
        
        return myConnectionSingleton;
    }
}
