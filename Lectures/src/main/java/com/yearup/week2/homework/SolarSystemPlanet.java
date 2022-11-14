package com.yearup.week2.homework;
import java.util.Scanner;

public class SolarSystemPlanet extends Planet {
     protected String star = "SUN";
     int position;
     String text = "The planet's position is ";
    SolarSystemPlanet(){
        System.out.println("Enter the planet name ");
        Scanner planetName = new Scanner(System.in);
        String planet = planetName.nextLine();

        switch (planet){
            case "mercury":
                System.out.println(text +  (position = 1));
                break;
            case "venus":
                System.out.println(text + (position = 2));
                break;
            case "earth":
                System.out.println(text + (position = 3));
                break;
            case "mars":
                System.out.println(text + (position = 4));
                break;
            case "jupiter":
                System.out.println(text + (position = 5));
                break;
            case "saturn":
                System.out.println(text + (position = 6));
                break;
            case "uranus":
                System.out.println(text + (position = 7));
                break;
            case "neptune":
                System.out.println(text + (position = 8));
                break;
            default:
                System.out.println("Please inout only planets:");
        }

    }

}
