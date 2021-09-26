/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.messages;

import com.odam.dao.MessageDAO;
import com.odam.models.Message;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class MessageService {
    
    public static void createMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escribe tu mensaje: ");
        String messageText = scanner.nextLine();
        
        System.out.println("Tu nombre: ");
        String name = scanner.nextLine();
        
        Message message = new Message();
        message.setMessage(messageText);
        message.setMessageAuthor(name);
        
        MessageDAO.createMessageDB(message);
    }
    
    public static void listMessages() {
    
    }
    
    public static void deleteMessage() {
    
    }
    
    public static void editMessage() {
    
    }
    
    
}
