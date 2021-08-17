package com.company;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(3701);
            int id = 1;
            while (true){
                Socket socket = server.accept();
                ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

                PackageData pd = (PackageData) inputStream.readObject();
                System.out.println("Client #"+id+ " connected");
                ClientHandler ch = new ClientHandler(socket, pd);
                ch.start();
                System.out.println(pd);
                id++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
