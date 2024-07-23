/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conv_monedas;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Conv_Monedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double MX, USD, EUR, THB, JPY, KRW, AUD, PEN, CAD, VES, ARS;
        int op;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESA UNA CANTIDAD EN PESOS MX");
        MX = sc.nextInt();
        
        System.out.println(" 1. Dolar (USD)\n 2. Euro (EUR)\n 3. Bath (THB)\n 4. Yen (JPY)\n 5. Won (KRW)\n "
     + "6. Dolar Australiano (AUD)\n 7. Sol (PEN)\n 8. Dolar Canadiense (CAD)\n 9. Bolivar (VES)\n10. Peso Argentino (ARS)");
        op = sc.nextInt();
         
       USD = MX*0.056;
       EUR = MX*0.051;
       THB = MX*2.02;
       JPY = MX*8.73;
       KRW = MX*77.28;
       AUD = MX*0.084;
       PEN = MX*0.21;
       CAD = MX*0.077;
       VES = MX*2.03;
       ARS = MX*51.56;
        
        switch(op){
            case 1 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A DOLAR ES DE: "+USD);
            break;
            case 2 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A EURO ES DE: "+EUR);
            break;
            case 3 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A BATH ES DE: "+THB);
            break;
            case 4 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A YEN ES DE: "+JPY);
            break;
            case 5 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A WON ES DE: "+KRW);
            break;
            case 6 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A DOLAR AUS ES DE: "+AUD);
            break;
            case 7 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A SOL ES DE: "+PEN);
            break;
            case 8 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A DOLAR CAD ES DE: "+CAD);
            break;
            case 9 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A BOLIVAR ES DE: "+VES);
            break;
            case 10 : System.out.println("ESTA CANTIDAD DE PESOS MX: "+MX+" A PESO ARGENTINO ES DE: "+ARS);
            break;
     
            default: System.out.println("INGRESE UNA CONVERSION DEL 1 AL 10");
            break;
        }
        // TODO code application logic here
    }
    
}
