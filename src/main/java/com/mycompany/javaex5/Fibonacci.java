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

    public int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public void start() {
        int n = 40;
        for (int i = 0; i < n; i++) {
            System.out.print(fib(i) + " ");
        }
    }
    
}
