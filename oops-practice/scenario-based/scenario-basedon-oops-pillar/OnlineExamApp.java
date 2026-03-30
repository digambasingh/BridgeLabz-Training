package com.bridgelabz.scenario;

import java.util.*;

//custom exception
class ExamTimeExpiredException extends Exception {
 public ExamTimeExpiredException(String message) {
     super(message);
 }
}

//Student class
class Student {
 int id;
 String name;

 Student(int id, String name) {
     this.id = id;
     this.name = name;
 }
}

//Question class
class Question {
 String question;
 String correctAnswer;

 Question(String question, String correctAnswer) {
     this.question = question;
     this.correctAnswer = correctAnswer;
 }
}

//Exam class
class Exam {
 String examName;
 List<Question> questions;
 boolean timeOver;

 Exam(String examName) {
     this.examName = examName;
     questions = new ArrayList<>();
     timeOver = false;
 }

 void addQuestion(Question q) {
     questions.add(q);
 }

 void endExam() {
     timeOver = true;
 }
}

//evaluation interface
interface EvaluationStrategy {
 int evaluate(List<Question> questions, List<String> answers)
         throws ExamTimeExpiredException;
}

//objective evaluation
class ObjectiveEvaluation implements EvaluationStrategy {

 public int evaluate(List<Question> questions, List<String> answers)
         throws ExamTimeExpiredException {

     int score = 0;
     for (int i = 0; i < questions.size(); i++) {
         if (questions.get(i).correctAnswer.equalsIgnoreCase(answers.get(i))) {
             score++;
         }
     }
     return score;
 }
}

//descriptive evaluation
class DescriptiveEvaluation implements EvaluationStrategy {

 public int evaluate(List<Question> questions, List<String> answers)
         throws ExamTimeExpiredException {

     // simple assumption
     return answers.size() * 2;
 }
}

//service class
class ExamService {

 void submitAnswers(Exam exam, EvaluationStrategy strategy,
                    List<String> answers)
         throws ExamTimeExpiredException {

     if (exam.timeOver) {
         throw new ExamTimeExpiredException("Exam time is over");
     }

     int result = strategy.evaluate(exam.questions, answers);
     System.out.println("Result: " + result);
 }
}

//main class
public class OnlineExamApp {
 public static void main(String[] args) {

     Student s1 = new Student(1, "Digambar");

     Exam exam = new Exam("Java Test");
     exam.addQuestion(new Question("What is JVM?", "Virtual Machine"));
     exam.addQuestion(new Question("What is OOP?", "Object Oriented"));

     List<String> answers = new ArrayList<>();
     answers.add("Virtual Machine");
     answers.add("Object Oriented");

     EvaluationStrategy evaluation = new ObjectiveEvaluation();
     ExamService service = new ExamService();

     try {
         service.submitAnswers(exam, evaluation, answers);
     } catch (ExamTimeExpiredException e) {
         System.out.println(e.getMessage());
     }

     exam.endExam();

     try {
         service.submitAnswers(exam, evaluation, answers);
     } catch (ExamTimeExpiredException e) {
         System.out.println(e.getMessage());
     }
 }
}
