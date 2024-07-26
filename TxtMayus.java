/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package txtmayus;

import java.util.Scanner;

/**
 *
 * @author EL_IN
 */
public class TxtMayus {
    public static void main(String[] args) {
        
      Scanner sc = new Scanner(System.in);
        String b;
        
        do{
            System.out.println("Ingrese una palabra");
            b=sc.nextLine();
            System.out.println(b.toUpperCase());
            
        }while(!b.equals(""));
    }
}

