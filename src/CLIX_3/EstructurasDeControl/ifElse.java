package CLIX_3.EstructurasDeControl;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {


        /* if(condicion){
          operaciones
         } else if(condicion){
            operaciones
         } else {
            si todo lo anterior es falso
         }
         */

        int number1 = 5;
        int number2 = 10;


        if (number1 > number2){
            System.out.println( "el numero " +number1 + " es mayor");
        }else {
            System.out.println( "el numero " +number2 + " es mayor");
        }

        System.out.println("FIN");

        Scanner scanner = new Scanner(System.in);

        System.out.println("CUAL ES TU EDAD?");
        int num = scanner.nextInt();

        comprobarEdad(num);

    }

    private static int comprobarEdad(int num) {


        String respuesta;



        if(num > 0 && num < 13) {
            respuesta = "Eres niño";
        }else if(num >13 && num <18 ) {
            respuesta = "Eres Jovencito**";
        }else if (num >18){
            respuesta = "Eres adulto";
        }else {
            respuesta = "solo numeros enteros";
        }


        System.out.println("Respuesta es: " + respuesta);
        return num;
    }
}
