package ScenarioBased.OnlineExam;

import java.util.Scanner;

public class OnlineExam {

    // Exam Start Method
    public int startExam() {

        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("===== ONLINE EXAM =====");

        // Question 1
        System.out.println("\n1. JVM ka Full Form kya hai?");
        System.out.println("A. Java Virtual Machine");
        System.out.println("B. Java Variable Method");
        System.out.println("C. Java Visual Machine");

        char ans1 = sc.next().charAt(0);

        if (ans1 == 'A' || ans1 == 'a') {
            score++;
        }

        // Question 2
        System.out.println("\n2. Java kis company ne develop ki?");
        System.out.println("A. Google");
        System.out.println("B. Microsoft");
        System.out.println("C. Sun Microsystems");

        char ans2 = sc.next().charAt(0);

        if (ans2 == 'C' || ans2 == 'c') {
            score++;
        }

        return score;
    }

    // Result Method
    public void showResult(int score) {

        System.out.println("\n===== RESULT =====");
        System.out.println("Your Score : " + score + "/2");

        if (score >= 1) {
            System.out.println("Status : PASS");
        } else {
            System.out.println("Status : FAIL");
        }
    }

    // Main Method
    public static void main(String[] args) {

        OnlineExam exam = new OnlineExam();

        int score = exam.startExam();

        exam.showResult(score);
    }
}