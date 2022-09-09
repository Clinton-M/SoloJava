package CLIX_3.EstructurasDeControl;

public class contuneAndBreack {

    public static void main(String[] args) {

        int count=0;

        while (count < 10) {

            count++; //condicion
            if (count == 6)
                continue;  //saltara el valor 6

            //inicio saltar
            System.out.println("Hola mundo  " +count);
            //fin saltado


        }
        System.out.println("fin");


        continueAndBreak();

        continueAndBreakFor();
    }

    private static void continueAndBreak() {
        int count=0;

        while (count < 10) {

            count++; //condicion
            if (count == 6)
                break; // se retira rompiendo el flujo de ejecucion

            //inicio romper
            System.out.println("Hola mundo  " +count);
            //fin abandonadondo el bucle


        }
        System.out.println("estoy fuera");
    }

    private static void continueAndBreakFor(){
        for (int i = 0; i <10 ; i++) {

            if (i == 6)
                continue;
            System.out.println("Hola mudo " +i );
        }

    }

}
