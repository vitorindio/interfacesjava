package com.vitorindio;

public class CarService {

    public void drive() {
        Car[] cars = {new BMW(), new Porsche(), new Mercedes() };
            for (Car car : cars) {
                car.drive();
            }
        }

//otherwise
    /*   public void drive(Car[] cars){
        for (Car car : cars) {
            car.drive();
        }
    }*/
}
