package CLIX_01.String;

import javax.swing.*;

public class ArrayMain {
    public static void main(String[] args) {

        String[] nombres =new String[3];

        nombres[0] = "clinton";
        nombres[1] = "clix";
        nombres[2] = "blout";

        for (int i = 0; i < nombres.length; i++){
            //System.out.println(nombres[i]);
            JOptionPane.showMessageDialog(null, nombres[i]);
        }


        int [] numeros  =new int[3];



        String[] nombres2 =new String[]{"clinton","mejia","chuchon"};

        for (int i = 0; i < nombres2.length ; i++) {
            JOptionPane.showMessageDialog(null,nombres2[i]);
        }

    }
}
