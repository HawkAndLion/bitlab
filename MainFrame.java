package com.company;

import javax.swing.*;

public class MainFrame extends JFrame {
private IPAndPort ipAndPort;
private MessagePage messagePage;
private FinalPage finalPage;

    public MainFrame(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("CLIENT");
        setSize(500, 500);
        setLayout(null);

        ipAndPort = new IPAndPort(this);
        ipAndPort.setVisible(true);
        add(ipAndPort);

        messagePage = new MessagePage(this);
        messagePage.setVisible(false);
        add(messagePage);

        finalPage = new FinalPage(this);
        finalPage.setVisible(false);
        add(finalPage);
    }

    public IPAndPort getIpAndPort() {
        return ipAndPort;
    }

    public void setIpAndPort(IPAndPort ipAndPort) {
        this.ipAndPort = ipAndPort;
    }

    public MessagePage getMessagePage() {
        return messagePage;
    }

    public void setMessagePage(MessagePage messagePage) {
        this.messagePage = messagePage;
    }

    public FinalPage getFinalPage() {
        return finalPage;
    }

    public void setFinalPage(FinalPage finalPage) {
        this.finalPage = finalPage;
    }
}
