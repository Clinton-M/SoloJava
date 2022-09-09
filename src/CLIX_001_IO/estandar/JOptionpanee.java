package CLIX_001_IO.estandar;

import javax.swing.JOptionPane;
public class JOptionpanee {
    public static void main(String[] args) {

         String nombre=JOptionPane.showInputDialog(null,"cual es tu nombre?");
         String edad= String.valueOf(Integer.parseInt(JOptionPane.showInputDialog(null,"cual es tu eda?")));


         JOptionPane.showMessageDialog(null,nombre);
        JOptionPane.showMessageDialog(null,edad);



    }


}
