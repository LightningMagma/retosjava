package retos;
import java.util.*;
public class reto_cinco {
    public static void main(String[] args) {
        int producto=0, precio=0, total=0, contador=0;
        Scanner leer = new Scanner(System.in);
        System.out.println("Este es el programa para registrar una venta");
        System.out.println("Ingrese la cantidad de productos a comprar. Recuerde que debe ser un número entero mayor a 0");
        producto = leer.nextInt();
        if (producto>0) {     
            while (contador<producto) {
                System.out.println("Ingrese el precio del producto");
                precio=leer.nextInt();
                total=total+precio;
                contador=contador+1;
            }
            System.out.println("Total de la compra es = " + total);
        } else {
            System.out.println("Ingreso no válido\n!!!SALIENDO DEL PROGRAMA!!!");
        }
        leer.close();
    }
    
}
