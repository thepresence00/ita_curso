/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promedio;
import java.util.Scanner;
/**
 *
 * @author EL_IN
 */
public class Promedio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Num1, num2, num3, prom;
       Scanner sc = new Scanner(System.in);
       System.out.println("Ingresa el numero 1");
       Num1 = sc.nextInt();
       System.out.println("Ingresa el numero 2");
       num2 = sc.nextInt();
       System.out.println("Ingresa el numero 3");
       num3 = sc.nextInt();
       prom=(Num1+num2+num3)/3;
        System.out.println("El promedio es de: "+prom);
        }
    
}
