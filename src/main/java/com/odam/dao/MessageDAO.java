/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.dao;

import com.odam.models.Message;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author David
 */
public class MessageDAO {
    
    public static void createMessageDB(Message message){
        MyConnection dbConnect = new MyConnection();
        
        try {
            Connection connection = dbConnect.get_connection();
            PreparedStatement preparedStatement = null;
            try{
                String query = "INSERT INTO mensajes (mensaje, autor_mensaje) VALUES (?,?)";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setString(1, message.getMessage());
                preparedStatement.setString(2, message.getMessageAuthor());
                preparedStatement.executeUpdate(); //Orden a la db para realizar la consulta
                
                System.out.println("Mensaje creado");
            } catch(SQLException e){
                 System.out.println(e);
            }
        
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static List<Message> readMessageDB(){
        
        List<Message> messageList = new ArrayList<>();
        
        MyConnection dbConnect = new MyConnection();
        try{
            Connection connection = dbConnect.get_connection();
            PreparedStatement preparedStatement = null;
            ResultSet resultSet = null;
            
            String query = "SELECT * FROM mensajes";
            preparedStatement = connection.prepareStatement(query);
            resultSet = preparedStatement.executeQuery();
            
            while(resultSet.next()){
                Message messageItem = new Message();
                messageItem.setIdMessage(resultSet.getInt("id_mensaje")); //De la columna "id_mensaje" settear al modelo de mensaje
                messageItem.setMessage(resultSet.getString("mensaje"));
                messageItem.setMessageAuthor(resultSet.getString("autor_mensaje"));
                messageItem.setMessageDate(resultSet.getString("fecha_mensaje"));
                
                messageList.add(messageItem);
            }
            
        } catch(Exception e){
            System.out.println(e);
        }
        return messageList;
    }
    
    public static void deleteMessageDB(int idMessage){
        
        MyConnection dbConnect = new MyConnection();
        
        try {
            Connection connection = dbConnect.get_connection();
            PreparedStatement preparedStatement = null;
            try{
                String query = "DELETE FROM mensajes WHERE mensajes.id_mensaje = ?";
                preparedStatement = connection.prepareStatement(query);
                preparedStatement.setInt(1, idMessage);
                preparedStatement.executeUpdate();
                System.out.println("El mensaje fue eliminado.");
            } catch(SQLException e){
                 System.out.println(e);
                 System.out.println("El mensaje no pudo ser eliminado.");
            }
        
        } catch(Exception e){
            System.out.println(e);
        }
    
    }
    
    public static void editMessageDB(Message message){
    
    }
    
    
}
