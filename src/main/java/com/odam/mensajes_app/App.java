/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.odam.mensajes_app;

//import com.odam.dao.MyConnection;
import com.odam.messages.MessageService;
//import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author David
 */
public class App {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);
        
        int option = 0;
        
        //System menu
        do {
            System.out.println("--------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            //Leer opción del usuario
            option = scanner.nextInt();
            
            switch(option){
                case 1:
                    MessageService.createMessage();
                    break;
                case 2:
                    MessageService.listMessages();
                    break;
                case 3:
                    MessageService.deleteMessage();
                    break;
                case 4:
                    MessageService.editMessage();
                    break;
                default:
                    break;
            }
        
        } while(option != 5);
        
        
//        MyConnection conexion = new MyConnection();
//        
//        try (Connection cnx = conexion.get_connection()){
//            
//        } catch(Exception e){
//            System.out.println(e);
//        }
        
    }
}
