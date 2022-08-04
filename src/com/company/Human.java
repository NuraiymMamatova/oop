package com.company;

public class Human {
    public static Laptop laptop;

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", growth=" + growth +
                ", colorHair='" + colorHair + '\'' +
                ", colorEis='" + colorEis + '\'' +
                ", name='" + name + '\'' +
                ", sureName='" + sureName + '\'' +
                ", Laptop=" + Laptop +
                '}';
    }

    public int age;
    public float weight;
    public float growth;
    public String colorHair;
    public String colorEis;
    public String name;
    public String sureName;
    public Laptop  Laptop;


}

