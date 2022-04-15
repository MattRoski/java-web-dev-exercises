package org.launchcode.java.studios.studio2;

import java.util.HashMap;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        String quote = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. " +
                "So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero." +
                " Once you’ve done that, it’s pretty straightforward from there.";

        String words = "";
        Scanner input = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        System.out.println("Enter a sentance to count: ");
        words = input.nextLine();
        String[] stringArray = words.split("\\W+");

        String result = new String();

        for(int i = 0; i < stringArray.length;i++){
            result = result+ stringArray[i];
        }

        char[] charactersInString = result.toLowerCase().toCharArray();

        for(int i = 0; i < charactersInString.length; i++){
             if(!map.containsKey(charactersInString[i])){
                map.put(charactersInString[i],1);
            } else{
                map.put(charactersInString[i],map.get(charactersInString[i]).intValue() + 1);
            }
        }
        for(Character key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
    }
}
