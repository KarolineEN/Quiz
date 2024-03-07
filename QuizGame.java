import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class QuizGame{

    //#Fields
    String question1 ="Hvilket sjokolade pålegg inneholder mest sjokolade?";
    String[] answers1 = {
            " ",
            "Nugatti",
            "Nutella",
            "Sjokade"};
    ----------------
    String question2 = "Hvilken planet i sol systemet er kjent for sine karakteristiske ringer?"
            + " " + "Mars, Jupiter, Saturn eller Venus";
    String answer2 = "Saturn";
    ---------------
    String question3="Hva er ulovlig å gjøre på et hotellrom i California?"
            +" Å skrelle en løk, Å be til gud, Å høre på musikk etter 18.00,Å danse?";
    String answer3="Å skrelle en løk";
    --------------
    JavaProgram newJavaProgram = new JavaProgram();

    Scanner quizAnswer = new Scanner(System.in);
    String userAnswer = quizAnswer.nextLine();
    int userPoints = 0;

    //#Methods
    public void question1(){
        System.out.println(question1);
        for(int i = 0; i < answers1.length; i++){
            System.out.println(answers1[i]);
        }

        String userAnswer = quizAnswer.nextLine();

        if(userAnswer.equals(answers1[2])){
            System.out.println("Riktig!");
            userPoints += 10;
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }else{
            System.out.println("Feil!");
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }
    }

    public void question2(){
        System.out.println(question2);
        String userAnswer = quizAnswer.nextLine();
        if(userAnswer.equals(answer2)){
            System.out.println("Riktig!");
            userPoints += 10;
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }else{
            System.out.println("Feil!");
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }
    }
    public void question3(){
        System.out.println(question3);
        String userAnswer=quizAnswer.nextLine();
        if(userAnswer.equals(answer3)){
            System.out.println("Riktig!");
            userPoints += 10;
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }else{
            System.out.println("Feil!");
            System.out.println("Du har totalt" + " " + userPoints + "poeng");
        }
    }
    public void endOfQuiz(){
        if(userPoints >= 20){
            System.out.println("Gratulerer du klarte quizen!");
        }else{
            System.out.println("Du klarte ikke quizen!");
        }
    }
}

