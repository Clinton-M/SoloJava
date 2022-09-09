package CLIX_4.OrientadoObjetos;

public class Coche {
    //atributos
    String color;
    String fabricante;
    String modelo;
    double peso;
    double largo;

    Integer velocidad=0;

    //construnctores
    public  Coche(){
        //din datos
    }
    public  Coche(String color, String fabricante,String modelo,double peso ,double largo ){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;

    }

    //comportamiento -->metodos || funciones

    public void  acelerar(Integer cantidad){

        if (cantidad>0 && cantidad<=120) {
            this.velocidad += cantidad;
        }
    }


    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
