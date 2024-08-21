package org.example.entity;


public class Car {

     String color;
     String model;
     String price;
     String tuzilishi;

    public Car() {
    }

    public Car(String color, String model, String price, String tuzilishi) {
        this.color = color;
        this.model = model;
        this.price = price;
        this.tuzilishi = tuzilishi;
    }

    public void getInformation(){
        System.out.println("Rangi: "+ color+"\n"+"Model: "+model+"\n"+"Narxi: "+price+"\n"+"Tuzilishi: "+tuzilishi);

    }

}
