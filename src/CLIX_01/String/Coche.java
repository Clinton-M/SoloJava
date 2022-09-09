package CLIX_01.String;

public class Coche {
   String name  = "nombre de coches";


    public  Coche() {}
   public  Coche(String name) { //constructor
       this.name = name;
   }

    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
