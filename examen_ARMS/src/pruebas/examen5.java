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
public class examen5 {
    public static void main(String[]args_angelraul){
    String salario=JOptionPane.showInputDialog("introduzca el salario ");
        double salariod=Double.parseDouble(salario);
        int años=Integer.parseInt(JOptionPane.showInputDialog("introduzca la cantidad de años"));
        double acum=1;
        
        for (int i=2;i<años;i++){
            salariod=salariod+(salariod*0.1);
            acum=salariod+(salariod*0.1);
            
        }
        JOptionPane.showMessageDialog(null, "la cantidad de sueldo que ha recibido en "+años+" años es "+acum);
    }
}
   
 

