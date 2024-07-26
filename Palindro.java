/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindro;

import java.util.Scanner;

/**
 *
 * @author EL_IN
 */
public class Palindro {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String pali;
    
    System.out.println("INGRESA UNA PALABRA");
    pali=sc.nextLine();
    String palind="";
    
    for(int i=pali.length()-1; i>=0; i--){
        palind=palind+pali.charAt(i);
        
    }
    if(palind.equals(pali)){
        System.out.println("ES PALINDROMO");
    }else{
        System.out.println("NO ES PALINDROMO");
    }
}
    }
    
