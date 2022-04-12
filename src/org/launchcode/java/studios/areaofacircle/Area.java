package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean loop = true;
        System.out.println("Enter the radius of the circle");


            try {
                while (loop) {
                    double rad = input.nextDouble();
                    if (rad <= 0) {
                        System.out.println("Enter a non-negative number");
                    } else {
                        System.out.println(Circle.getArea(rad));
                        loop = false;
                    }
                }


            } catch (Exception error) {
                System.out.println("Input mismatch. Must enter a number.");
            }

    }



}
