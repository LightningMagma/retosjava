package retos;
import java.util.*;
public class reto_cuatro {
    public static void main(String[] args) {
        int eleccionMaquina=(int)(Math.random()*3+1), eleccionUsuario=0;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Este es un programa para jugar al 'Piedra, papel o tijera' contra la máquina");
        System.out.println("Ingrese su elección:\nOprima el número 1 para elegir Piedra\nOprima el número 2 para elegir Papel\nOprima el número 3 para elegir Tijera");
        eleccionUsuario=ingreso.nextInt();
        if (eleccionUsuario==1 || eleccionUsuario==2 || eleccionUsuario==3) {
            System.out.println("Elección usuario: "+eleccionUsuario);
            System.out.println("Elección máquina: "+eleccionMaquina);
            if (eleccionUsuario==eleccionMaquina && eleccionUsuario<4) {
                System.out.println("Hay empate");
            } else if(eleccionUsuario==1 && eleccionMaquina==3 && eleccionUsuario<4){
                System.out.println("Gana el usuario");
            }else if(eleccionMaquina==1 && eleccionUsuario==3 && eleccionUsuario<4){
                System.out.println("Gana la máquina");
            }else if(eleccionUsuario>eleccionMaquina && eleccionUsuario<4){
                System.out.println("Gana el usuario");
            } else if(eleccionMaquina>eleccionUsuario && eleccionUsuario<4){
                System.out.println("Gana la máquina");
            } else{
                System.out.println("No válido");
            }
        } else {
            System.out.println("Ingreso no válido\n!!!SALIENDO DEL PROGRAMA!!!");
        }
        ingreso.close();
    }

}
