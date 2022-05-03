package org.launchcode.java.studios.FunWithQuizzes;

public class Program {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();

        MultipleChoiceQuestion myMultiChoiceQuestion = new MultipleChoiceQuestion("What color is a stop sign?\nA: Yellow\nB: Blue\nC:Red\nD:Purple", "C");
        myQuiz.addQuestion(myMultiChoiceQuestion);

        CheckBoxClass myCheckBoxQuestion = new CheckBoxClass("Select all that apply, which animal can fly?\nA: Bird\nB:Bluegill\nC:Cat\nD:Dove", "A,D");
        myQuiz.addQuestion(myCheckBoxQuestion);

        TrueFalseQuestion myTrueFalse = new TrueFalseQuestion("True or False, Coffee tastes good?\nA: True\nB:False","A");
        myQuiz.addQuestion(myTrueFalse);

        myQuiz.runQuiz();
    }
}
