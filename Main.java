package com.company;

import javax.sound.midi.Soundbank;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MainFrame frame = new MainFrame();
        frame.setVisible(true);
    }
}
