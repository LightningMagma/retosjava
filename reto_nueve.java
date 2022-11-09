package retos;
import java.util.*;
public class reto_nueve {
    public static void main(String[] args) {
        int[][] valor=new int[2][2];
        String[][] producto=new String[2][2];
        Scanner ingreso=new Scanner(System.in);
        System.out.println("Bienvenido a la máquina expendedora\nPrimero debe registrar los productos con su nombre y precio respectivo");
        for (int i = 0; i < producto.length; i++) {
            for (int j = 0; j < producto.length; j++) {
                System.out.println("Ingrese el nombre del producto que estará en la posición ["+i+""+j+"]");
                producto[i][j]=ingreso.next();
                System.out.println("Ingrese el precio del producto que estará en la posición ["+i+""+j+"]");
                valor[i][j]=ingreso.nextInt();
            }
        }

        for (int i = 0; i < producto.length; i++) {
            System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
            for (int j = 0; j < producto.length; j++) {
                System.out.print(""+i+""+j+" "+producto[i][j]+" "+valor[i][j]+"   ");
            }
            System.out.println("\n■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
        }
        ingreso.close();
    }
}
