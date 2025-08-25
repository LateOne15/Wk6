/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.averagescore;

/**
 *
 * @author 30128198
 */
public class CalculateAverage {
    public static double calc(int[] scores) {
        double avg = 0.0;
        double sum = 0.0;
        
        for(int score: scores) {
            sum+=score;
        }
        
        avg = sum/scores.length;
        
        return avg;
    }
}
