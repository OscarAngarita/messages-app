/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.dao;

import com.odam.models.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author David
 */
public class MessageDAO {
    
    public static void createMessageDB(Message message){
        MyConnection dbConnect = new MyConnection();
        
        try (Connection connection = dbConnect.get_connection()){
            
            PreparedStatement preparedStatement = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, message.getMessage());
                preparedStatement.setString(2, message.getMessageAuthor());
                preparedStatement.executeUpdate(); //Orden a la db para realisar la consulta
                
                System.out.println("Mensaje creado");
            } catch(SQLException e){
                 System.out.println(e);
            }
        
        } catch(SQLException e){
            System.out.println(e);
        }
    }
    
    public static void readMessageDB(){
    
    }
    
    public static void deleteMessageDB(int idMessage){
    
    }
    
    public static void editMessageDB(Message message){
    
    }
    
    
}
