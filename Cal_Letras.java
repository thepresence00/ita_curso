/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cal_letras;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Cal_Letras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESA TU CALIFICACION");
        numero = sc.nextInt();
        
        if(numero>=90 && numero<=100){
            System.out.println("TU CALIFICACION ES A");
        }else if(numero>=80 && numero<=89){
            System.out.println("TU CALIFICACION ES B");
        }else if(numero>=70 && numero<=79){
            System.out.println("TU CALIFICACION ES C");
        }else if(numero>=60 && numero<=69){
            System.out.println("TU CALIFICACION ES D");
        }else if(numero<60){
            System.out.println("TU CALIFICACION ES F");
        }else{
            System.out.println("INGRESA UN NUMERO DEL 1 AL 100");
        }
        // TODO code application logic here
    }
    
}
