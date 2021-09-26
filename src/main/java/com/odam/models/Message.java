/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.models;

/**
 *
 * @author David
 */
public class Message {
    private int idMessage;
    private String message;
    private String messageAuthor;
    private String messageDate;
    
    public Message(){
    }

    public Message(String message, String messageAuthor, String messageDate) {
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
    }
    


    public int getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(int idMessage) {
        this.idMessage = idMessage;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getMessageAuthor() {
        return messageAuthor;
    }

    public void setMessageAuthor(String messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public String getMessageDate() {
        return messageDate;
    }

    public void setMessageDate(String messageDate) {
        this.messageDate = messageDate;
    }
    
    
    
}
