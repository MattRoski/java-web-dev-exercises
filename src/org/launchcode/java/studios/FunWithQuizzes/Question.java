package org.launchcode.java.studios.FunWithQuizzes;

public class Question {
    private String question;
    private String answer;

    public Question(String question, String answer){
        this.question = question;
        this.answer = answer;
    }

    public String getQuestion(){
        return this.question;
    }

    public String getAnswer(){
        return this.answer;
    }

    public boolean checkAnswer(String answer){
        if(this.answer == answer){
            return true;
        } else{
            return false;
        }
    }
}
