package retos;
import java.lang.reflect.Array;
import java.util.*;

import javax.annotation.processing.SupportedOptions;
public class reto_ocho {
    public static void main(String[] args) {
        int cantidadnadadores=0;
        double[] tiempo;
        String[] nadador;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Bienvenido al programa que registra los tiempos por participante de la competencia de natación\nIngrese la cantidad de nadadores que van a competir. Recuerde que debe ser un número entero mayor a 0.");
        cantidadnadadores=ingreso.nextInt();
        tiempo=new double[cantidadnadadores];
        nadador=new String[cantidadnadadores];
        if (cantidadnadadores>0) {
            for (int i = 0; i < 3; i++) {
                System.out.println("");
                for (int j = 0; j < 80; j++) {
                    System.out.print("█");
                }
            }
            System.out.println("\n\nA continuación ingrese los nombres y los tiempos de los competidores.\nRecuerde que los tiempos deben ser números mayores a 0. Para ingresar un valor decimal hágalo con una separación con COMA. Ejemplo: 7,5");
            for (int i = 0; i < nadador.length; i++) {
                System.out.println("\nIngrese el nombre del competidor número "+(i+1)+":");
                nadador[i]=ingreso.next();
                System.out.println("Ingrese el tiempo registrado para el competidor número "+(i+1)+":");
                tiempo[i]=ingreso.nextDouble();
            }
            for (int i = 0; i < 3; i++) {
                System.out.println("");
                for (int j = 0; j < 80; j++) {
                    System.out.print("■");
                }
            }
            System.out.println("\nLos resultados son:");
            for (int i = 0; i < nadador.length; i++) {
                System.out.println("\n"+nadador[i]+" con un tiempo de "+tiempo[i]);
                for (int j = 0; j < 1; j++) {
                    System.out.println("");
                    for (int k = 0; k < 80; k++) {
                        System.out.print("¯");
                    }
                }
            }
            Arrays.sort(tiempo);
            
            /*for (Double i : tiempo) {
                System.out.println(i);
            }*/
            for (int i=0; i >= 0 ; i--) {
                System.out.println("\nEl tiempo ganador fue "+tiempo[i]);
            }
        } else {
            System.out.println("El valor ingresado no es válido.\n!!!SALIENDO DEL PROGRAMA!!!");
        }
        ingreso.close();
    }
}
