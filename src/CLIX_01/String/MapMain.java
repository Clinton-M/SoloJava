package CLIX_01.String;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {


        //implementation
        Map<String, String> personas = new HashMap<>();
        //clave : valor
        personas.put("2001C", "clinton");
        personas.put("2001J", "jan");
        personas.put("2001K", "kyle");

        System.out.println(personas);
        // for para mostrar claves
        for (String key : personas.keySet()) {
        System.out.println(key);

        // for para mostrar valores
        }
        for (String value : personas.values()) {
            System.out.println(value);
        }

        // for para mostrar AMBAS COSAS
        for (Map.Entry<String, String> entry :personas.entrySet()){
            System.out.println(entry.getKey() + "--> " + entry.getValue());
        }
    }

}

