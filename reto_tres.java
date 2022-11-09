package retos;
import java.util.*;
public class reto_tres {
    public static void main(String[] args) {
        int lanzarMoneda=(int)(Math.random()*2+1), eleccion=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Este es un programa para jugar al carisellazo");
        System.out.println("Ingrese su elección:\nOprima el número 1 para elegir CARA\nOprima el número 2 para elegir SELLO");
        eleccion=ingreso.nextInt();
        if(eleccion==1 || eleccion==2){
            if (lanzarMoneda==1) {
                System.out.println("Cayó CARA");
            } else {
                System.out.println("Cayó SELLO");
            }

            if (lanzarMoneda==eleccion && lanzarMoneda == 1) {
                System.out.println("Usted ha ganado porque eligió CARA");
            } else if(lanzarMoneda==eleccion && lanzarMoneda==2) {
                System.out.println("Usted ha ganado porque eligió SELLO");
            } else{
                System.out.println("Lo sentimos, usted ha perdido");
            }
        } else{
            System.out.println("Ingreso no válido\n!!!SALIENDO DEL PROGRAMA!!!");
        }
        ingreso.close();
    }
}
