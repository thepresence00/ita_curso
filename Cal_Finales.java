/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cal_finales;
import java.util.*;
/**
 *
 * @author EL_IN
 */
public class Cal_Finales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        float Parciales, Proyecto,prom, ExFinal;
        double ParcialesP, ProyectoP, ExFinalP, CalF;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingresa50 tu calificacion de Parciales: ");
        Parciales= sc.nextFloat();
        
        System.out.println("Ingresa tu calificacion de Proyecto: ");
        Proyecto= sc.nextFloat();
        
        System.out.println("Ingresa tu calificacion de Examen Final: ");
        ExFinal= sc.nextFloat();
        
        ParcialesP = Parciales*0.40;
        ProyectoP = Proyecto*0.30;
        ExFinalP = ExFinal*0.30;
        
        CalF = (ParcialesP + ProyectoP+ ExFinalP);
        prom = (Parciales + Proyecto + ExFinal)/3;
        
        System.out.println("LA CALIFICACION FINAL ES DE: "+CalF);
        System.out.println("EL RPOMEDIO ES DE: "+prom);
        // TODO code application logic here
    }
    
}
