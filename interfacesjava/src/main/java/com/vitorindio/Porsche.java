package com.vitorindio;

public class Porsche implements Car, Loggable, Asset, Property {

    public void drive(){
        System.out.println("Porsche DRIVING");
    }

    public int value() {
        return 350000;
    }

    public String owner(){
        return null;
    }

    @Override
    public String message() {
        return null;
    }
}
