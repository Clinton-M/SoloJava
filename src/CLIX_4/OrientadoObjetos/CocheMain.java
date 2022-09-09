package CLIX_4.OrientadoObjetos;

public class CocheMain {
    public static void main(String[] args) {
        String conche = "alfa romeo";
        // invocando al emtodo constructor
        Coche cocheObj = new Coche();
        Coche cocheObj2 = new Coche("rojo","honda","civic",1430.45,5.4);

        cocheObj2.acelerar(50);

        System.out.println(cocheObj2);

        cocheObj2.peso=1350.8;

        System.out.println(cocheObj2);

        //otra clase
        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico="Ejemplo motor";
        cocheElectrico.color="Verde";
        cocheElectrico.fabricante="Honda";
        cocheElectrico.modelo="civic";

        System.out.println(cocheElectrico);

        CocheElectrico cocheElectrico2 = new CocheElectrico("TXTZ","azul","alfa",
                "romeo",1500d,4.99);

        System.out.println(cocheElectrico2);
        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

        //otra clae

        CocheHibrido cocheHibrido = new CocheHibrido("Ejemplo motorHibrido");

        System.out.println(cocheHibrido);


    }
}
