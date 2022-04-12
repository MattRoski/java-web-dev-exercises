package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double rad = input.nextDouble();
        while(rad < 1 ){
            System.out.println("Enter a valid input");
            rad = input.nextDouble();
        }
        System.out.println(Circle.getArea(rad));
    }


}
