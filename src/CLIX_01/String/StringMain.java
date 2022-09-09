package CLIX_01.String;

import javax.swing.*;

public class StringMain {
    public static void main(String[] args) {
        // la clase String

        /*
        length()  -->longitud
        startsWith("")
        endsWith("")
        indexOf("")
        substring("")
        trim("") --->quita espacio
        equals("") --->comparacion
        compareTo("")
         */

        String message = "  Hola mundo";
        String messsageMay = message.toUpperCase();
        String messageMinus = message.toLowerCase();
        String messageTrim = message.trim();

        JOptionPane.showMessageDialog(null, message.length());
        JOptionPane.showMessageDialog(null, messsageMay);
        JOptionPane.showMessageDialog(null, messageMinus);
        JOptionPane.showMessageDialog(null, messageTrim +" sin espacio");


        var message1 = "Clinton";
        var message2 = "CLINTON";

        if (message1.equalsIgnoreCase(message2)){  //IGNORA LOWER Y UPPER
            JOptionPane.showMessageDialog(null, "Hola Clinton!!");
        }



    }
}
