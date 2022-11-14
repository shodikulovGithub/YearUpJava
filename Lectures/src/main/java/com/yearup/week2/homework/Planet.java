package com.yearup.week2.homework;
import java.util.Scanner;

public class Planet implements Calculator{

    double radius;
    protected String star;
    String planetName;
    String planetRadius;

    Planet(){
        System.out.println("Enter the planet radius: ");
        Scanner findRadius = new Scanner(System.in);
        radius = findRadius.nextDouble();
        System.out.print("The area of the planet by radius is: ");
        System.out.println(areaByRadius());
    }

    public double areaByLength(){return 0;}
    public double calSum(){return 0;};

    public double areaByRadius(){
        double byRadius = radius * radius * 3.14;
        return byRadius;
        }
    }
