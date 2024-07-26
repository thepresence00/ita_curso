/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numraiz;

import java.util.Scanner;

/**
 *
 * @author EL_IN
 */
public class NumRaiz {
    public static void main(String[] args) {
         double Num, r;
        Scanner f= new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        Num=f.nextInt();
        r=Math.sqrt(Num);
        
        System.out.println("La raiz cuadrada del numero ingresado es: "+r);
    }
}
