/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arearectangulo;
import java.util.Scanner;
/**
 *
 * @author EL_IN
 */
public class AreaRectangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int Base, lado , resultado;
        Scanner sc = new Scanner(System.in);
       System.out.println("Inrgresa el lado del rectanngulo");
       lado = sc.nextInt();
       System.out.println("Ingresa el Ancho del Rectangulo");
       Base = sc.nextInt();
       resultado= Base*lado;
       System.out.println("EL AREA DEL RECTANGULO ES DE: "+resultado);
     }
    
}
