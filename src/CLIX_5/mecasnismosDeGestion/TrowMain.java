package CLIX_5.mecasnismosDeGestion;

import java.util.Scanner;

public class TrowMain {

    public static void main(String[] args) {

        try {
            leerNombres();
        }catch (NameFormatException e){
            e.printStackTrace();
        }

    }
    /**
     * metodo que lee nombres de consola y verifica que tengan longitud igual o mayor  8
     * caracteres
     *

    @throws NameFormatException
     */
    private  static void leerNombres()throws NameFormatException{
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un nombre");

        while (entrada.hasNext()){
            System.out.println("Introduce  un nombre");
            String nombre = entrada.nextLine();

            if (nombre.length()<8){
                entrada.close();
                throw  new NameFormatException("El nombre debe tener minimo 8 caracteres");

            }
        }
        entrada.close();

    }
}
