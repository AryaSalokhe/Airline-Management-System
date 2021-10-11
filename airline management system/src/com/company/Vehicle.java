package com.company;

public class Vehicle implements Car{
    @Override
    public void drive() {
        System.out.println("Car has started ");
    }

    @Override
    public void stop() {
        System.out.println("Car has stopped");
    }

    public static void main(String[]args){

        Vehicle v = new Vehicle();
        v.drive();
        v.stop();
    }
}
