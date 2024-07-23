/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imc;
import java.util.Scanner;
/**
 *
 * @author EL_IN
 */
public class IMC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      float altura, Peso, IMC;
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingresa la altura");
      altura= sc.nextFloat();
      System.out.println("Ingresa el peso");
      Peso= sc.nextFloat();
      IMC= Peso/(altura*altura);
      System.out.println("EL IMC ES DE: "+IMC);
    }
    
}
