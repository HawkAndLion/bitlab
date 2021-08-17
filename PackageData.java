package com.company;

import java.io.Serializable;

public class PackageData implements Serializable {
    private String message;

    public PackageData(String message){
        this.message = message;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message = message;
    }
    public String toString(){
        return message;
    }
}
