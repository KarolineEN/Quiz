package Karoline.Quiz;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Question {

    public static void askQuestions () {

        File file = new File("/Users/karolineelisabethnordvik/IdeaProjects/PGR112v24/student/KarolineEN/projects/Quiz/QuizFile");

        try {
            Scanner input = new Scanner(file);
            Scanner userAnswer = new Scanner(System.in);

            String question;
            String answer;
            String correctAnswer = null;
            String inputAnswer;
            ArrayList<String> answers = new ArrayList<>();


            while (input.hasNextLine()) {
                question = input.nextLine();
                System.out.println(question);


                for (int i = 0; i < 3; i++) {
                    answer = input.nextLine();
                    answers.add(answer);
                    System.out.println(answers.get(i));
                }

                correctAnswer = input.nextLine();
                inputAnswer = userAnswer.nextLine();

                if (inputAnswer.equals(correctAnswer)) {
                    System.out.println("Riktig! Her er neste spørsmål: \n");
                } else {
                    System.out.println("Beklager, det var feil. Prøv på nytt!");
                    break;
                }

                answers.clear();
            }
            input.close();


        } catch (FileNotFoundException e) {
            System.out.println("Filen ble ikke funnet: ");
        }
    }
}
