/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad_votar;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Edad_Votar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA TU EDAD");
        edad = sc.nextInt();
        if(edad>=18){
            System.out.println("PUEDE VOTAR");
        }else{
            System.out.println("AUN NO PUEDE VOTAR");
        }
        // TODO code application logic here
    }
    
}
