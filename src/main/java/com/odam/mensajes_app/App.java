/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.mensajes_app;

import com.odam.dao.MyConnection;
import java.sql.Connection;

/**
 *
 * @author David
 */
public class App {
    public static void main(String[] args){
        
        MyConnection conexion = new MyConnection();
        
        try (Connection cnx = conexion.get_connection()){
            
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
