package com.company;

import java.util.Scanner;

public class Triangle {
    public int a;
    public int b;
    public int c;
    public int p;

    static void area (){
        Triangle triangle = new Triangle();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую сторону треугольника  :");
        triangle.a= scanner.nextInt();
        System.out.println("Введите вторую сторону треугольника  :");
        triangle.b= scanner.nextInt();
        System.out.println("Введите третью сторону треугольника  :");
        triangle.c= scanner.nextInt();
        triangle.p = triangle.a+ triangle.b+ triangle.c/2;
        System.out.println("Площадь треугольника:"+triangle.p);
    }
}

