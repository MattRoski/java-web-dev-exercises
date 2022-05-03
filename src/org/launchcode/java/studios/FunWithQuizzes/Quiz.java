package org.launchcode.java.studios.FunWithQuizzes;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private Scanner askQuestion = new Scanner(System.in);
    private int numberOfCorrect = 0;


    public Quiz(){}

    public void addQuestion(Question question){
        this.questions.add(question);
    }

    public void runQuiz(){
        String response;
        for(int i = 0; i < questions.size(); i++){
            System.out.println(questions.get(i).getQuestion());
             response = askQuestion.nextLine();
             if(questions.get(i).checkAnswer(response)){
                 System.out.println("Correct!");
                 numberOfCorrect++;
             } else{
                 System.out.println("Wrong..");

             }
        }
        double percentCorrect = 100*(1.0* this.numberOfCorrect / this.questions.size() );
        System.out.println("Grade: " + percentCorrect + "%");
    }



}
