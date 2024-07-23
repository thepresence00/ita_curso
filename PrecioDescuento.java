/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciodescuento;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class PrecioDescuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          float numero;
          double desc, tot;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESA EL MONTO");
        numero =sc.nextInt();
        
        if(numero<=100){
            System.out.println("SIN DESCUENTO");
            
        }else if(numero>100 && numero<=200){
            desc= numero*0.10;
            tot=numero-desc;
            System.out.println("TU DESCUENTO ES DEL 10% Y EL TOTAL ES DE: "+tot);
            
        }else if(numero>200 && numero<=500){
             desc= numero*0.20;
            tot=numero-desc;
            System.out.println("TU DESCUENTO ES DEL 20% Y EL TOTAL ES DE: "+tot);
            
        }else if(numero>500){
             desc= numero*0.25;
            tot=numero-desc;
            System.out.println("TU DESCUENTO ES DEL 25% Y EL TOTAL ES DE: "+tot);
        }
        // TODO code application logic here
    }
    
}
