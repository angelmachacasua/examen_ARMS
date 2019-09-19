package javaapplication.ExamenAngel;

import javax.swing.JOptionPane;

public class JavaApplication1 {

    
    public static void main(String[] args) {
        int mayor=0;
        int menor=99;
        double promedio=0;
        int suma=0;
        for (int i = 1; i <= 5; i++) {
            int nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese una nota:"+i));
            if(nota>mayor){
                mayor=nota;
            }
            suma=suma+nota; //Acumulador
        }
        promedio=suma/5;
       JOptionPane.showConfirmDialog(null,"La nota Mayor es:"+mayor);
       JOptionPane.showConfirmDialog(null,"La nota Menor es:"+menor);
       JOptionPane.showConfirmDialog(null,"El Promedio es:"+promedio);
       int leer
    }
    
}
