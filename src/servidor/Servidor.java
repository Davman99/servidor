/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servidor;
import java.net.*;
import java.io.*;
/**
 *
 * @author Francisco
 */
public class Servidor {
    ServerSocket server;
    Socket socket;
    int puerto = 4500;
    DataOutputStream salida;
    BufferedReader entrada;
    public void iniciar() {
        try {
            server = new ServerSocket(puerto);
            socket = new Socket();
            socket = server.accept();
            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String mensaje = entrada.readLine();
            System.out.println(mensaje);
            salida = new DataOutputStream(socket.getOutputStream());
            salida.writeUTF("aa");
            socket.close();
        }
        catch(Exception e){};            
        }
    }
   
    

