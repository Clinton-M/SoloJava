package CLIX_4.OrientadoObjetos;

public class CocheElectrico extends Coche{ //hereamos de clase coche

    String motorElectrico;

    public CocheElectrico(){

    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String motorElectrico, String color, String fabricante,String modelo,double peso ,double largo ){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    @Override
    public void  acelerar(Integer cantidad){
        Integer cantidadAjustada= cantidad*2;
        super.acelerar(cantidadAjustada);

    }


    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
