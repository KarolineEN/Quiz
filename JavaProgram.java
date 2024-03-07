import java.sql.SQLOutput;
import java.util.Scanner;
public class JavaProgram{
    public static void main(String[]args){
        JavaProgram newJavaProgram = new JavaProgram();
        QuizGame newQuizGameProgram = new QuizGame();

        //Intro
        System.out.println("Velkommen til min quiz.");
        System.out.println("For å bestå trenger du 20 poeng. Hvert riktig svar gir deg 10 poeng");

        //Question1
        System.out.println(" ");
        newQuizGameProgram.question1();

        //Question2
        System.out.println(" ");
        newQuizGameProgram.question2();

        //Question3
        System.out.println(" ");
        newQuizGameProgram.question3();

        //Endofquiz
        System.out.println(" ");
        newQuizGameProgram.endOfQuiz();
    }
}


