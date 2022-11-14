package com.yearup.week2.homework;
import java.util.Scanner;

public class ImplementsCal implements Calculator {

    double length;

    ImplementsCal() {
        System.out.println("Enter the length: ");
        Scanner num = new Scanner(System.in);
        length = num.nextDouble();
        System.out.print("The area of the planet is: ");
        System.out.println(areaByLength());

    }


    public double areaByLength(){
        double byLength = length * length;
        return byLength;
    }
    public double calSum(){
        return 0;
    };
    public double areaByRadius(){return 0; };
    }
