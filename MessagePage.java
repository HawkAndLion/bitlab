package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;

public class MessagePage extends JPanel {
    private MainFrame parent;

    private JLabel label, text;
    private JTextField textField;
    private JButton buttonSendMessage;

    public MessagePage() {
    }

    public MessagePage(MainFrame parent) {
        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        label = new JLabel("Message: ");
        label.setSize(70, 30);
        label.setLocation(100, 50);
        add(label);

        textField = new JTextField("Write message here");
        textField.setSize(300, 150);
        textField.setLocation(100, 100);
        add(textField);

        buttonSendMessage = new JButton("SEND");
        buttonSendMessage.setSize(300, 30);
        buttonSendMessage.setLocation(100, 300);
        add(buttonSendMessage);

        buttonSendMessage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Socket socket = new Socket("localhost", 3701);
                    try {
                            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
                            String msg = textField.getText();
                            PackageData pd = new PackageData(msg);
                            outputStream.writeObject(pd);
                            System.out.println(pd);

                    } catch (Exception ioException) {
                        ioException.printStackTrace();
                    }
                    parent.getIpAndPort().setVisible(false);
                    parent.getMessagePage().setVisible(false);
                    parent.getFinalPage().setVisible(true);
                } catch (Exception j) {
                    j.printStackTrace();
                }
            }
        });
    }
}
