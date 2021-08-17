package com.company;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class ClientHandler extends Thread {
    private Socket socket;
    private PackageData pd;

    public ClientHandler(Socket socket, PackageData pd) {
        this.socket = socket;
        this.pd = pd;
    }

    public void run() {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            while(true){
                String text = (String) inputStream.readObject();
                PackageData pd = new PackageData(text);
                outputStream.writeObject(pd);
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }
}
