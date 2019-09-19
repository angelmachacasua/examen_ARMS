/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio 7
 */
public class practica4 {
    public static void main(String[]args_angelraul){
        String num1=JOptionPane.showInputDialog("introduzca el primer numero");
        String num2=JOptionPane.showInputDialog("introduzca el segundo numero");
        double num1d=Double.parseDouble(num1);
        double num2d=Double.parseDouble(num2);
        String signo=JOptionPane.showInputDialog("introduzca la operacion que quiere realizar");
        double resultado=0;
        switch (signo) {
            case "+":
                resultado=num1d+num2d;
                break;
            case "-":
                resultado=num1d-num2d;
                break;
            case "*":
                resultado=num1d*num2d;
                break;
            default:
                resultado=num1d/num2d;
                break;
        }
        JOptionPane.showMessageDialog(null, "el resultado es: "+resultado);
    }

    }
    

