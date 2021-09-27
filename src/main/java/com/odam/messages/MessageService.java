/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.messages;

import com.odam.dao.MessageDAO;
import com.odam.models.Message;
import java.util.List;
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
        List<Message> messageList = MessageDAO.readMessageDB();

        for (Message messageItem: messageList) {
            System.out.println("---------------------------------");
            System.out.println("MESSAGE #" + (messageList.indexOf(messageItem) + 1));
            System.out.println("ID: " + messageItem.getIdMessage());
            System.out.println("Message: " + messageItem.getMessage());
            System.out.println("Author: " + messageItem.getMessageAuthor());
            System.out.println("Date: " + messageItem.getMessageDate());
        }
    }
    
    public static void deleteMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a eliminar: ");
        int idMessage = scanner.nextInt();
        MessageDAO.deleteMessageDB(idMessage);
    
    }
    
    public static void editMessage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a editar: ");
        int idMessage = Integer.parseInt(scanner.nextLine());
        
        System.out.println("Escribe tu nuevo mensaje: ");
        String messageText = scanner.nextLine();
        
        
        Message editedMessage = new Message();
        editedMessage.setIdMessage(idMessage);
        editedMessage.setMessage(messageText);
        
        MessageDAO.editMessageDB(editedMessage);
    }
}
    
    
