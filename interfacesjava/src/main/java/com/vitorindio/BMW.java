package com.vitorindio;

public class BMW implements Car, Loggable, Asset, Property {

    public void drive(){
        System.out.println("BMW DRIVING");
    }

    public int value(){
        return 250000;
    }

    public String owner(){
        return "Vitor";
    }

    public String message(){
        return "Owner : " ;
    }

}
