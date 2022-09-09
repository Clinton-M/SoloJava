package CLIX_001_IO.estandar;

import java.util.Scanner;

public class ScannerMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce un nombre");
        String nombre = scanner.nextLine();

        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();


        System.out.println("el nombre instroducido es  "+ nombre);
        System.out.println("el numero instroducido es  "+ numero);

        //scanner.nextLine(); --> poner uno sin datos //


        scanner.close();  //---> terminar scanner
    }
}
