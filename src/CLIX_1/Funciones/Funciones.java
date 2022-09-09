package CLIX_1.Funciones;

public class Funciones {

    public static void main(String[] args) {
        HolaMUndo();

        HolaMUndo("Clix");

        var mosrtar = HolaMUndodOS("Clnton");
        System.out.println(mosrtar);

    }


    private   static void HolaMUndo(){

        System.out.println("Hola MUndo");

    }

    private   static void HolaMUndo(String nombre){
        System.out.println("HOLA " + nombre);
    }

    private   static String HolaMUndodOS(String nombre){

        return "Hola " + nombre + " Saluda al mundo" ;
    }


}
