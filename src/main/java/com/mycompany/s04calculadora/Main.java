/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.s04calculadora;
import com.mycompany.*;
import javax.swing.JOptionPane;

/**
 *
 * @author scont
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Calculadora casio = new Calculadora();
        
        // version 1
       /*
        Double num1, num2;
        num1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num1"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num2"));
        System.out.println(casio.sumar(num1, num2));
        System.out.println(casio.restar(num1, num2));
        System.out.println(casio.producto(num1, num2));
        System.out.println(casio.dividir(num1, num2));
         */
       
        // version 2
        
        Integer opcion;
        Double num1, num2;
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de operacion que quiere /n 1 para suma /n 2 para resta /n 3 para multiplicar /n 4 para dividr"));
        if (opcion == 1) {
            double resultado;
            num1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 1"));
            num2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 2"));
            resultado = casio.sumar(num1,num2);
            JOptionPane.showMessageDialog(null, resultado);
            } if (opcion == 2) {
                double resultado;
                num1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 1"));
                num2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 2"));
                resultado = casio.restar(num1,num2);
                JOptionPane.showMessageDialog(null, resultado);
                } if (opcion == 3) {
                    double resultado;
                    num1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 1"));
                    num2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 2"));
                    resultado = casio.producto(num1,num2);
                    JOptionPane.showMessageDialog(null, resultado);
                        } if (opcion == 4) {
                        double resultado;
                        num1 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 1"));
                        num2 = Double.parseDouble(JOptionPane.showInputDialog("Inserte num 2"));
                        resultado = casio.dividir(num1,num2);
                        JOptionPane.showMessageDialog(null, resultado);
                        }
        
    }
    
}
