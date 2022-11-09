package retos;
import java.util.*;
public class reto_uno {
    public static void main(String[] args) {
        double gradoF=0, gradoC=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Bienvenido al programa de conversión de temperaturas.\nEste programa solo hace conversión de grados Fahrenheit (°F) a grados Centigrados/Celsius (°C)\nIngrese los grados Fahrenheit (°F) que desea convertir. Recuerde que para ingresar un valor decimal debe hacerlo con una separación por medio de COMA.\nPor ejemplo: 75,5.");
        gradoF=ingreso.nextDouble();
        gradoC=(gradoF-32)/1.8;
        System.out.println(gradoF+" grados Fahrenheit equivalen a "+ gradoC + " grados Centigrados");
        ingreso.close();
    }
}
