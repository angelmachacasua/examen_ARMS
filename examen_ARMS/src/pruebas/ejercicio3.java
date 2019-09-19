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
public class ejercicio3 {
    public static void main(String[]args_angelraul){
    int num1=Integer.parseInt(JOptionPane.showInputDialog("introduzca el primer numero"));
        int num2=Integer.parseInt(JOptionPane.showInputDialog("introduzca el segundo numero"));
        int num3=Integer.parseInt(JOptionPane.showInputDialog("introduzca el tercer numero"));
        int may;
        int med;
        int men;
     
    }
    
    
    public static void examen_angelraul(){
    int men;
    int med;
    int may;
System.out.println("introduzca el primer numero");
int num1=leer.nextInt();
System.out.println("introduzca el segundo numero");
int num2=leer.nextInt();
System.out.println("introduzca el tercer numero");
int num3=leer.nextInt();
if(num1>num2 && num1>num3){
    may=num1;
    if(num2>num3){
        med=num2;
        men=num3;
    }else{
        med=num2;
        men=num3;
    }
    System.out.println("el numero mayor es: "+may+" el numero medio es: "+med+" el numero menor es "+men);
}
if(num2>num1 && num2>num3){
    may=num2;
    if(num1>num3){
        med=num1;
        men=num3;
    }else{
        med=num3;
        men=num1;
    }
    System.out.print("el numero mayor es: "+may+" el numero medio es:"+med+" el numero menor es: "+men);
}
if(num3>1 && num3>num2){
    may=num3;
    if(num2>num1){
        med=num2;
        men=num1;
    }else{
        med=num1;
        men=num2;
    }
    System.out.println("el numero mayor es: "+may+" el numero medio es: "+med+" el numero menor es:"+men);
}
 
    }
}
    

