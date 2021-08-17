package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class IPAndPort extends JPanel {
    private MainFrame parent;

    private JButton button;
    private JTextField textField;
    private JLabel label;

    public IPAndPort(MainFrame parent) {
        this.parent = parent;

        setSize(500, 500);
        setLayout(null);

        JLabel label1 = new JLabel("IP: ");
        label1.setSize(50, 30);
        label1.setLocation(100, 100);
        add(label1);

        JTextField textField = new JTextField("localhost");
        textField.setSize(200, 30);
        textField.setLocation(160, 100);
        add(textField);

        JLabel label2 = new JLabel("PORT: ");
        label2.setSize(50, 30);
        label2.setLocation(100, 140);
        add(label2);

        JTextField textField1 = new JTextField("3701");
        textField1.setSize(200, 30);
        textField1.setLocation(160, 140);
        add(textField1);

        button = new JButton("CONNECT");
        button.setSize(300, 30);
        button.setLocation(100, 200);
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                    try {
                        String msg = textField.getText();
                        String msg1 = textField1.getText();
                        if (msg.equals("localhost") && msg1.equals(String.valueOf(3701))) {
                            parent.getIpAndPort().setVisible(false);
                            parent.getMessagePage().setVisible(true);
                            parent.getFinalPage().setVisible(false);
                        }
                    } catch (Exception ioException) {
                        ioException.printStackTrace();
                    }
            }
        });
    }
}
