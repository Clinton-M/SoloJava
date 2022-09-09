package CLIX_5.mecasnismosDeGestion;

public class TryCatchMain {
    public static void main(String[] args) {

        try {

            int respuesta = 5 / 0;
        }catch (ArithmeticException e){  //Exception
            e.printStackTrace(); // metodopara imprimir
        }finally { //siempre se ejecuta para llevar a cabo como estaba antes
            System.out.println("cierre de recursos");
        }

        System.out.println("fin");
    }
}
