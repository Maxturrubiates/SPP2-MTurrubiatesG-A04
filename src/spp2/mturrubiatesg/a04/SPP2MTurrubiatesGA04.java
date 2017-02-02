/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.mturrubiatesg.a04;
import java.util.Scanner;
/**
 *
 * @author Max
 */
public class SPP2MTurrubiatesGA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado= new Scanner (System.in);
        int opEntrada;
        double ang, r;
        
        System.out.println("Actividad 4");
        System.out.println("1. Calcular tangente");
        System.out.println("2. Calcular seno");
        System.out.println("3. Calcular conseno");
        System.out.println("4. Salir");
        System.out.println("Seleccione el numero de la opcion que desee usar");
        
       opEntrada = teclado.nextInt();
       
       switch (opEntrada){
           case 1:
               System.out.println("Bienvenido a Cálculo de Tangente");
               System.out.println("Introduce el ángulo del cual deseas conocer la Tangente:");
               ang= teclado.nextDouble();
               r= Math.tan((ang*Math.PI)/180);
               System.out.println("La tangente de "+ ang +"° es= "+r);
               break;
           case 2:
               System.out.println("Bienvenido a Cálculo de Seno");
               System.out.println("Introduce el ángulo del cual deseas conocer el Seno:");
               ang= teclado.nextDouble();
               r= Math.sin((ang*Math.PI)/180);
               System.out.println("El seno de "+ ang +"° es= "+r);
               break;
           case 3:
               System.out.println("Bienvenido a Cálculo de Coseno");
               System.out.println("Introduce el ángulo del cual deseas conocer el Coseno:");
               ang= teclado.nextDouble();
               r= Math.cos((ang*Math.PI)/180);
               System.out.println("El Coseno de "+ ang +"° es= "+r);
               break;
           default:
               System.out.println("Gracias por usar el programa :)");
       }
        // TODO code application logic here
    }
    
}
