package retos;
import java.util.*;
public class reto_dos {
    public static void main(String[] args) {
        double peso=0, meses=0, dosis=0;
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Bienvenido al programa para calcular la dosis de la vacuna que se va a aplicar");
        System.out.println("Ingrese el peso del bebé en Kilogramos, debe ser un valor entero mayor a 0. Recuerde que para ingresar un valor decimal, debe hacerlo con una separación por medio de COMA. Ejemplo: 4,5");
        peso=ingreso.nextDouble();
        if (peso>0) {
            System.out.println("Ingrese la edad del bebé en meses. Solo se aceptan números enteros mayores a 0");
            meses=ingreso.nextDouble();
            if (meses>0) {
                dosis=8*((peso+10)/(meses*10));
                System.out.println("La dosis que debe aplicar es igual a "+dosis);
            } else {
                System.out.println("Dato no válido.\n!!!SALIENDO DEL PROGRAMA!!!");
            }
        }else{
            System.out.println("El valor ingresado no es correcto.\n!!!SALIENDO DEL PROGRAMA!!!");
        }
        ingreso.close();
    }
}
