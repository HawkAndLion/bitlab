package com.company;

import javax.swing.*;

public class FinalPage extends JPanel {
    private MainFrame parent;

    private JLabel label;
    public FinalPage(MainFrame parent){
        this.parent = parent;
        setSize(500, 500);
        setLayout(null);

        label = new JLabel("Your message was successfully sent!");
        label.setSize(300, 30);
        label.setLocation(120, 200);
        add(label);
    }

}
