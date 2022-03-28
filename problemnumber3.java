package com.OOP;

import java.util.Scanner;

public class problemnumber3 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] numScore = new int[numStudents];
        for (int i = 0; i < numScore.length; i++){
            System.out.print("Enter the grade of Student " + i + ": ");
            int Score = input.nextInt();
            numScore[i] = Score;
        }
        double totalScore = 0;
        for (int i = 0 ; i < numStudents; i++){
            totalScore += numScore[i];
        }
        double average = (totalScore/numStudents);
        System.out.println("The average is: " + average);
        int maxScore = numScore[0];
        int minScore = numScore[0];
        for(int i=0;i < numScore.length;i++){
            if(numScore[i]<minScore){
                minScore = numScore[i];
            }
            if(numScore[i]>maxScore){
                maxScore = numScore[i];
            }
        }
        System.out.println("The minimum is: " + minScore);
        System.out.println("The maximum is: " + maxScore);
    }
}