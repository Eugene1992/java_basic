package queGen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class QuestionGenerator {
    private final static String FILE = "C:\\JavaRush\\JavaRushHomeWork\\src\\com\\javarush\\test\\example\\queGen\\Questions.txt";
    private static ArrayList<String> questions = new ArrayList<String>();
    private static ArrayList<String> students = new ArrayList<String>(Arrays.asList("Оксане", "Дмитрию", "Павелу", "Сергею"));

    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader questionReader = new BufferedReader(new FileReader(FILE));
            while (questionReader.ready()) {
            String s = questionReader.readLine();
            questions.add(s);
        }
        BufferedReader anotherQuestionReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("--------------------------------------------------\n" +
                           "--- Welcome to Random Question Generator v2.0! ---" +
                           "\n--------------------------------------------------");
        QuestionGenerator.makeDelay(2);
        System.out.println("Начать работу? Yes/No?");
        if ((anotherQuestionReader.readLine()).equals("Yes")) {}
        else return;
        QuestionGenerator.makeDelay(2);
        QuestionGenerator.askQuestion();
        while (true) {
            System.out.println("\nЗадать еще вопросик? Yes/No?");
            String answer = anotherQuestionReader.readLine();
            if (answer.equals("Yes")) QuestionGenerator.askQuestion();
            if (answer.equals("No")) {
                System.out.println("Ученик убегает - JVM побеждает!");
                break;
            }
        }
    }

    private static void askQuestion() throws InterruptedException {
        System.out.println(students.get((int)(Math.random()*4)) + " выпадает вопрос номер " + questions.get((int)(Math.random()*56)));
        QuestionGenerator.makeDelay(3);
        System.out.println("Компилятор оценивает шансы на правильный ответ в " + (int)(Math.random()*100) + "%");
        QuestionGenerator.makeDelay(5);
    }

    private static void makeDelay(int seconds) throws InterruptedException {
        Thread.sleep(seconds*1000);
    }
}
