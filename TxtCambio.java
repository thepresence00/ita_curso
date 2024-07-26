/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package txtcambio;

import java.util.Scanner;

/**
 *
 * @author EL_IN
 */
public class TxtCambio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String P, c, n;
        
            System.out.println("INGRESA UNA PALABRA");
            P=sc.nextLine();
            
            System.out.println("INGRESA LETRA A CAMBIAR");
            c=sc.nextLine();
            
            System.out.println("INDICA LETRA POR CUAL HARA EL CAMBIO");
            n=sc.nextLine();
            
            System.out.println("LA PALABRA CON CAMBIO ES: "+ P.replace(c, n));
    }
}
