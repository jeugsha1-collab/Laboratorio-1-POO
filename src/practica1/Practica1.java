/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica1;
import java.util.Scanner;
/**
 *
 * @author labesp
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su Edad: ");
        edad = sc.nextInt();
        if (edad >= 18) {
            if(edad > 65){
                if(edad > 105){
                    System.out.println("se Excede la Edad");
                }else{
                    System.out.println("es Tercera Edad");
                }
            }else{
                System.out.println("es Mayor de Edad");
            }
        }else{
            if(edad < 0){
                System.out.println("Edad no valida - Valor Negativo");
            }else{
                System.out.println("Menor de Edad");
            }

    }  
   }
