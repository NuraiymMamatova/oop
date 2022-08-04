package com.company;

public class Laptop {
    public static int weight;
    String brand = "Apple";
     int memory=256;
     String color= "black";
     //double weight;
     public int price;
     String owner;
     boolean b ;
    char a;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", memory=" + memory +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", owner='" + owner + '\'' +
                ", b=" + b +
                ", a=" + a +
                '}';
    }
}
