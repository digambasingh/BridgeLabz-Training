package com.bridgelabz.examproctor;

import java.util.*;

public class ExamProctor {

    private Stack<Integer> navigationStack = new Stack<>();
    private HashMap<Integer, String> studentAnswers = new HashMap<>();
    private HashMap<Integer, String> correctAnswers = new HashMap<>();

    // Constructor
    public ExamProctor() {
        correctAnswers.put(1, "A");
        correctAnswers.put(2, "C");
        correctAnswers.put(3, "B");
        correctAnswers.put(4, "D");
    }

    // navigation using stack
    public void visitQuestion(int questionId) {
        navigationStack.push(questionId);
        System.out.println("Visited Question: " + questionId);
    }

    // Store answers in HashMap
    public void submitAnswer(int questionId, String answer) {
        studentAnswers.put(questionId, answer);
        System.out.println("Answer saved for Q" + questionId);
    }

    //  Go back to last visited question
    public void goBack() {
        if (navigationStack.isEmpty()) {
            System.out.println("No previous question");
            return;
        }
        int lastQuestion = navigationStack.pop();
        System.out.println("Returned to Question: " + lastQuestion);
    }

    //  Evaluate exam using function
    public int calculateScore() {
        int score = 0;

        for (int qId : correctAnswers.keySet()) {
            if (studentAnswers.containsKey(qId) &&
                studentAnswers.get(qId).equals(correctAnswers.get(qId))) {
                score++;
            }
        }
        return score;
    }
}
