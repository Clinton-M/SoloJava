package CLIX_3.EstructurasDeControl;

public class LoopWhile {
    public static void main(String[] args) {
        loopWhile();

    }

    private static void loopWhile() {
        int count = 0;
        while (count < 2) {
            System.out.println(1 +"-->pasa");
            System.out.println(2 +"--> pasa");

            count++;
            System.out.println("vuelta == " + count);

        }
        System.out.println("FIN");
    }
}
