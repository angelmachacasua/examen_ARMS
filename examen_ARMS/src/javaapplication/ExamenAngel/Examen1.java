/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication.ExamenAngel;

import javax.swing.JOptionPane;

/**
 *
 * @author Laboratorio 7
 */
public class Examen1 {
    public static void main(String[] arms) {
        int dias=Integer.parseInt(JOptionPane.showInputDialog("Introdusca el Numero de Dias:"));
        int hotel=Integer.parseInt(JOptionPane.showInputDialog("Introdusca el cuarto del Hotel:"));
        int comida=Integer.parseInt(JOptionPane.showInputDialog("Introdusca el costo de la comida :"));
        int dinero_diario=100;
        int suma_gastos=hotel+comida+dinero_diario;
        
        int precio_total=dias*suma_gastos;    
        JOptionPane.showConfirmDialog(null, "el precio total es: "+precio_total);

            
        }
    }


    

