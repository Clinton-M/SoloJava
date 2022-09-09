package CLIX_1.Funciones;

public class FuncionesSobrecargada {

    public static void main(String[] args) {

        /*cuando los nombres de las funciones
         son repetidas estamos sobrecargando*/


        //no da error porque ocupamos parametros variados

        holaMundo();
        holaMundo("Clix");
        holaMundo("clinton","Soy nuevo");
        suma(5,2)            ;
    }

    private static void holaMundo() {
        System.out.println("Hola Mundos");
    }

    private static void holaMundo(String name) {
         System.out.println("Hola "+ name);
    }

    private static void holaMundo(String name, String description) {
        System.out.println("Hola "+ name + " " + description);
    }

    private  static  int suma(int x, int y) {
        return x + y;
    }

    //en constructor tambien se puede sobrecargar






}
