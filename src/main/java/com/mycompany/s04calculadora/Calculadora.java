/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.s04calculadora;

/**
 *
 * @author scont
 */
public class Calculadora {
    public Double sumar(double num1, double num2){
       Double suma;
       suma = num1 + num2;
       return suma;
       // version corta "return suma = num1 - num2;"
       }
    
    public Double restar (double num1, double num2) {
        Double resta;
        return resta = num1 - num2;
    }
    
    public Double producto (double num1, double num2) {
        Double producto;
        return producto = num1 * num2;
    }
    
    public Double dividir (double num1, double num2) {
        Double dividir;
        return dividir = num1 / num2;
    }
    
}
