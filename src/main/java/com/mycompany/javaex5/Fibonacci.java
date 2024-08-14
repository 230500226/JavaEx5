/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javaex5;

/**
 *
 * @author ldxt460s
 */
public class Fibonacci {

    public static void start() {
        int n = 40;
        int a = 0, b = 1, c;
        System.out.print("Fibonacci Series of " + n + " numbers: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
    
}
