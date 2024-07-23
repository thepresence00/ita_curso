/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conv_grados;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Conv_Grados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Celsius, Fahrenheit, kelvin;
        int op;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESA LOS GRADOS EN CELSIUS");
        Celsius = sc.nextInt();
        
        System.out.println("CONVERTIR GRADOS A \n (1) FAHRENHEIT \n  (2) KELVIN ");
        op = sc.nextInt();
        
        Fahrenheit = (Celsius*1.8)+32;
        kelvin = Celsius+273;
        
        switch(op){
            case 1: System.out.println("LOS GRADOS CELSIUS A FAHRENHEIT SON: "+Fahrenheit);
            break;
            case 2: System.out.println("LOS GRADOS CELSIUS A KELVIN SON: "+kelvin);
            break;
            
            default: System.out.println("INGRESE LA OPCION 1 o 2");
            break;
        } 
        // TODO code application logic here
    }
    
}
