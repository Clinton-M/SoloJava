package CLIX_01.String;

import java.util.ArrayList;
import java.util.List;

public class ListMain {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();


        nombres.add("noombre 1");
        nombres.add("noombre 2");
        nombres.add("noombre 3");
        nombres.add("noombre 4");
        nombres.add("noombre 5");


        System.out.println(nombres);

        //foreach
        for (String nombre: nombres) {
            System.out.println(nombre);
        }


        List<Coche> coches= new ArrayList<>();
        coches.add(new Coche("honda civic"));
        coches.add(new Coche("civic"));
        coches.add(new Coche("civic202"));

        System.out.println(coches);

        for (Coche coche : coches) {
            System.out.println(coche);
        }

    }
}
