/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package meses_estacion;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Meses_Estacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESA EL NUMERO DE MES: ");
        mes = sc.nextInt();
        switch(mes){
            case 1: System.out.println("ES INVIERNO");
            break;
            case 2: System.out.println("ES INVIERNO");
            break;
            case 3: System.out.println("ES PRIMAVERA");
            break;
            case 4: System.out.println("ES PRIMAVERA");
            break;
            case 5: System.out.println("ES PRIMAVERA");
            break;
            case 6: System.out.println("ES VERANO");
            break;
            case 7: System.out.println("ES VERANO");
            break;
            case 8: System.out.println("ES VERANO");
            break;
            case 9: System.out.println("ES VERANO");
            break;
            case 10: System.out.println("ES OTOÑO");
            break;
            case 11: System.out.println("ES OTOÑO");
            break;
            case 12: System.out.println("ES INVIERNO");
            break;
            default: System.out.println("INGRESA UN MES DEL 1-12");
            break;
        }
        
     
    }
    
}
