package com.scenario;

import java.util.*;

class InvalidQuizSubmissionException extends Exception {
    public InvalidQuizSubmissionException(String msg) {
        super(msg);
    }
}

class QuizProcessor {

    public static int calculateScore(String[] correct, String[] user)
            throws InvalidQuizSubmissionException {

        if (correct.length != user.length)
            throw new InvalidQuizSubmissionException("Answer length mismatch");

        int score = 0;
        for (int i = 0; i < correct.length; i++) {
            if (correct[i].equalsIgnoreCase(user[i]))
                score++;
        }
        return score;
    }

    public static String getGrade(int score) {
        if (score >= 4) return "A";
        if (score >= 2) return "B";
        return "C";
    }
}

public class QuizApp {
    public static void main(String[] args) {

        String[] correct = {"A", "B", "C", "D"};
        String[] user = {"A", "B", "D", "D"};

        List<Integer> scores = new ArrayList<>();

        try {
            int score = QuizProcessor.calculateScore(correct, user);
            scores.add(score);

            System.out.println("Score: " + score);
            System.out.println("Grade: " + QuizProcessor.getGrade(score));

        } catch (InvalidQuizSubmissionException e) {
            System.out.println(e.getMessage());
        }
    }
}

