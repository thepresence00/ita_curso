/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mdivisor;

import java.util.Scanner;

/**
 *
 * @author EL_IN
 */
public class Mdivisor {
 public static int divisor(int x, int y){
        int A=Math.max(x, y);
        int B=Math.min(x, y);
        int R=0;
        do{
            R=B;
            B=A%B;
            A=R;
        }while(B!=0);
        return R;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Ingrese un numero");
        n1=sc.nextInt();
        
        System.out.println("Ingrese otro numero");
        n2=sc.nextInt();
        
        System.out.println("El minimo comun divisor es; "+divisor(n1, n2));
        
    }
}
