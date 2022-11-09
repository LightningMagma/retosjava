package retos;

import java.util.Scanner;
import java.util.*;
public class reto_siete {
    public static void main(String[] args) {
        double notafinal=0;
        int cantidadnotas=0;
        double[] notas;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Este es un programa para calcular el promedio de notas\nIngrese la cantidad de notas* a evaluar:\n*Recordar que la cantidad de notas debe ser un número entero mayor a 0.");
        cantidadnotas=ingreso.nextInt();
        notas=new double[cantidadnotas];
        if (cantidadnotas>0) {
            for (int i = 0; i < notas.length; i++) {
                System.out.println("\nA continuación ingrese las notas. Recuerde que las notas son entre 0 y 5, para ingresar un valor decimal hágalo con una separación con COMA. Ejemplo: 3,5\nIngrese la nota número "+(i+1)+":");
                notas[i]=ingreso.nextDouble();
                notafinal=notafinal+notas[i];
            }
            notafinal=notafinal/notas.length;
            if (notafinal<3 && notafinal>=0) {
                System.out.println("\n\nReprobaste\nTu nota fue: "+notafinal);
            } else if(notafinal>=3 && notafinal<=4){
                System.out.println("\n\nPasaste raspando\nTu nota fue: "+notafinal);
            } else if(notafinal>4 && notafinal<=5){
                System.out.println("\n\nAprobaste con buenos resultados\nTu nota fue: "+notafinal);
            } else{
                System.out.println("\n\nAlguno de los datos fue ingresado de manera errónea.");
            }
        } else {
            System.out.println("El valor ingresado no es válido.\n!!!SALIENDO DEL PROGRAMA!!!");
        }

        
        ingreso.close();
    }
}
