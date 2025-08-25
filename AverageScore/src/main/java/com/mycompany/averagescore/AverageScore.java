/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.averagescore;
import java.util.Scanner;

/**
 *
 * @author 30128198
 */
public class AverageScore {

    public static void main(String[] args) {
        double scores[] = new double[10];
        double sum = 0.0, avg=0.0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter scores of 10 students:");
        for(int i = 0; i < scores.length; i++) {
            scores[i] = sc.nextDouble();
        }
        
        for(double score: scores) {
            sum+=score;
        }
        avg = sum/scores.length;
        
        System.out.println("The average score is "+avg);
    }
}
