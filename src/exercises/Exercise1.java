package exercises;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        System.out.println("Hello, what is your name:");
//        String name = input.nextLine();
//        System.out.println("Hello " + name);
//
//        System.out.println("Enter the length of a rectangle: ");
//        int length = input.nextInt();
//        System.out.println("Enter the width of a rectangle: ");
//        int width = input.nextInt();
//        System.out.println(length*width);

//        System.out.println("Enter number of miles driven: ");
//        int miles = input.nextInt();
//        System.out.println("Enter number of gallons used: ");
//        int gallons = input.nextInt();
//        System.out.println(miles/(gallons*1.0));

        System.out.println("Enter a word to search with: ");
    String searchWord = input.nextLine();
    input.close();

    String sentance = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do:" +
            " once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, '" +
            "and what is the use of a book,' thought Alice 'without pictures or conversation?'";
    if(sentance.toLowerCase().contains(searchWord.toLowerCase())){
        System.out.println(true);
        removeWord(sentance,searchWord);
    };

    }
    public static void removeWord(String str, String word){
        // Split the string using split() method
        String msg[] = str.split(" ");
        String new_str = "";

        // Iterating the string using for each loop
        for (String words : msg) {

            // If desired word is found
            if (!words.equals(word)) {

                // Concat the word not equal to the given
                // word
                new_str += words + " ";
            }
        }

        // Print the new String
        System.out.print(new_str);
    };

}

