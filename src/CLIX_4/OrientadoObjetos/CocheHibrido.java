package CLIX_4.OrientadoObjetos;

public class CocheHibrido extends Coche {

    String motorHibrio;

    public CocheHibrido(){

    }
    public CocheHibrido(String motorHibrio) {
        this.motorHibrio = motorHibrio;
    }

    @Override
    public String toString() {
        return "CocheHirbido{" +
                "motorHibrio='" + motorHibrio + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
