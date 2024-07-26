/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numprimof;

import java.util.Scanner;

/**
 *
 * @author EL_IN
 */
public class NumPrimoF {

    public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
        int n;
        System.out.println("INGRESE NUM PARA DETERMINAR SI ES PRIMO");
        n=sc.nextInt();
        
        System.out.println(primo(n));
    }
        public static boolean primo(int b){
            if(b%1==0 && b%b==0){
                return true;
            }else{
                return false;
            }
            
        
    }
}

