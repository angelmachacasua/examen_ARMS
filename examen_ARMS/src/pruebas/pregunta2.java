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
public class pregunta2 {
    
/*public static void examen1_angelraul(){
        int antiguedad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la antiguedad del fulano:"));
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el sueldo del fulano:"));
        double bono=0;
        if(antiguedad>4 || sueldo<2000 ){
            bono=0.25*sueldo;
        }else{
        bono=0.20*sueldo;
        }
        JOptionPane.showMessageDialog(null, "El sueldo del empleado: "+bono);
    }*/
    public static void main(String[]args_angelraul){
    int antiguedad=Integer.parseInt(JOptionPane.showInputDialog("ingrese la antiguedad del fulano:"));
        int sueldo=Integer.parseInt(JOptionPane.showInputDialog("ingrese el sueldo del fulano:"));
        double bono=0;
        if(antiguedad>4 || sueldo<2000 ){
            bono=0.25*sueldo;
        }else{
        bono=0.20*sueldo;
        }
        JOptionPane.showMessageDialog(null, "El sueldo del empleado: "+bono);
    }
    }
 