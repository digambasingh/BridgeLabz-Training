package com.scenario;

class QuizGrader {

    public static int calculateScore(String[] correct, String[] student) {
        int score = 0;

        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                score++;
            }
        }
        return score;
    }

    public static void printFeedback(String[] correct, String[] student) {
        for (int i = 0; i < correct.length; i++) {
            if (student[i].equalsIgnoreCase(correct[i])) {
                System.out.println("Question " + (i + 1) + ": Correct");
            } else {
                System.out.println("Question " + (i + 1) + ": Incorrect");
            }
        }
    }
}


public class QuizTest {
    public static void main(String[] args) {

        String[] correctAnswers = {
            "A", "B", "C", "D", "A",
            "C", "B", "D", "A", "B"
        };

        String[] studentAnswers = {
            "a", "B", "d", "D", "A",
            "C", "b", "A", "A", "B"
        };

        QuizGrader.printFeedback(correctAnswers, studentAnswers);

        int score = QuizGrader.calculateScore(correctAnswers, studentAnswers);
        double percentage = (score / 10.0) * 100;

        System.out.println("Score: " + score + "/10");
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 50) {
            System.out.println("Result: PASS");
        } else {
            System.out.println("Result: FAIL");
        }
    }
}
