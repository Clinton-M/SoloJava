package CLIX_4.OrientadoObjetos;

public class PolmorfismoMain {
    public static void main(String[] args) {

        Coche coche1 = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        //pilimorfismo

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if(coche4 instanceof CocheElectrico){
            System.out.println( "COCHE ELECTRICO");

        }
        if(coche5 instanceof CocheHibrido){
            System.out.println( "COCHE HIBRIDO");

        }
    }
}
