package CLIX_3.EstructurasDeControl;

public class Switch {
    public static void main(String[] args) {



        String weather = "sunny";

        switch (weather) {
            case "sunny":
                System.out.println("El tiempo es soleado");
                break;
            case "cloudy":
                System.out.println("El tiempo es nublado");
                break;
            default:
                System.out.println("no se ha podido identificar el clima");
        }


    }
}
