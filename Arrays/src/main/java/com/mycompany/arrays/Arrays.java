/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author 30128198
 */
public class Arrays {

    public static void main(String[] args) {
        int[] array = { -20, 19, 1, 5, -1, 27, 19, 5 };
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println("The minimum of this array is: " + min);
        
        min = array[0];
        for (int i: array) {
            if (i<min) {
                min = i;
            }
        }
        System.out.println("The minimum of this array is: " + min);
    }
}
