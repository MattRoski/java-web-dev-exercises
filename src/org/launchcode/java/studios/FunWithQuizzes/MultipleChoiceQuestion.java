package org.launchcode.java.studios.FunWithQuizzes;

public class MultipleChoiceQuestion extends Question{
    public MultipleChoiceQuestion(String question, String answer){
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer){
        String actualAnswer = this.getAnswer();
        if(answer.toLowerCase().equals(actualAnswer.toLowerCase())){
            return true;
        } else{
            return false;
        }

    }
}
