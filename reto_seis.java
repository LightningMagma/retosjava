package retos;
import java.util.*;
public class reto_seis {
    public static void main(String[] args) {
        int jugado=0, apuesta=0, lanzarMoneda=0, eleccion=0, gana =500, pierde =-500;

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de dinero para apostar. Puede ser 500 o 1000");
        apuesta = ingreso.nextInt();
        if (apuesta==500||apuesta==1000) {
            do 
            {
                lanzarMoneda=(int)(Math.random()*2+1);
                System.out.println("Ingrese su elección:\nOprima el número 1 para elegir CARA\nOprima el número 2 para elegir SELLO");
                eleccion=ingreso.nextInt();
                if (eleccion==1||eleccion==2) {
                    if (lanzarMoneda==1) {
                        System.out.println("Cayó CARA");
                    } else {
                        System.out.println("Cayó SELLO");
                    }

                    if (lanzarMoneda==eleccion && lanzarMoneda == 1) {
                        System.out.println("Usted ha ganado porque eligió CARA");
                        apuesta=apuesta+gana;
                    } else if(lanzarMoneda==eleccion && lanzarMoneda==2) {
                        System.out.println("Usted ha ganado porque eligió SELLO");
                        apuesta=apuesta+gana;
                    } else{
                        System.out.println("Lo sentimos, usted ha perdido");
                        apuesta=apuesta+pierde;
                    }
                    System.out.println("Acumulado hasta el momento: "+apuesta+"\n");
                    jugado=jugado+1;
                } else {
                    System.out.println("Ingreso no válido\n");
                }

            }while(apuesta != 0 || apuesta == 5000);

            System.out.println("Total de veces jugadas: " + jugado +"\n");
            System.out.println("Total de dinero acumulado: "+apuesta+"\n");
        } else {
            System.out.println("Ingreso no válido\n!!!SALIENDO DEL PROGRAMA!!!");
        }
        ingreso.close();
    }
}
