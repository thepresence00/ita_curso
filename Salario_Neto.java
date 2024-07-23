/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package salario_neto;
import java.util.Scanner;
/**
 *
 * @author EL_IN
 */
public class Salario_Neto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float SalarioBruto = 0, SalarioNeto;
        float PcImpuestos = 0, DcAdicionales = 0, Impuesto;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("INGRESA EL SALARIO BRUTO");
        SalarioBruto=sc.nextFloat();
        System.out.println("INGRESA EL PORCENTAJE DE IMPUESTOS");
        PcImpuestos=sc.nextFloat();
        System.out.println("INGRESA LAS DEDUCCIONAES ADICIONALES");
        DcAdicionales=sc.nextFloat();
        
        Impuesto = (SalarioBruto)*(PcImpuestos/100);
        SalarioNeto = SalarioBruto - Impuesto - DcAdicionales;
        
        System.out.println("EL SALARIO NETO ES DE: "+SalarioNeto);
        // TODO code application logic here
    }
    
}
