package com.vitorindio;

public class Mercedes implements Car, Loggable, Asset, Property {
    @Override
    public int value(){
        return 150000;
    }

    @Override
    public String owner (){
        return null;
    }

    public void drive(){
        System.out.println("Mercedes DRIVING");
    }
    @Override
    public String message() {
        return null;
    }
}
