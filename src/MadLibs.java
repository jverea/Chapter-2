import javax.swing.*;

public class MadLibs {
    public static void main(String[] args){
    String color;
    String WordEST;
    String bodyPartPlural;
    String animal;
    String noun;
    String pluralNoun;
    String aString;
    String bString;
    int a;
    int b;
    int c;

        color = JOptionPane.showInputDialog(null, "Enter a color.", JOptionPane.INFORMATION_MESSAGE);

        WordEST = JOptionPane.showInputDialog(null,
                "Enter a EST", JOptionPane.INFORMATION_MESSAGE);
        bodyPartPlural = JOptionPane.showInputDialog(null,
                    "Enter a plural body part", JOptionPane.INFORMATION_MESSAGE);
        animal = JOptionPane.showInputDialog(null,
                    "ENter an animal", JOptionPane.INFORMATION_MESSAGE);
        noun = JOptionPane.showInputDialog(null,
            "Enter a noun.",JOptionPane.INFORMATION_MESSAGE);
        pluralNoun =  JOptionPane.showInputDialog(null,
                "Enter a plural noun",JOptionPane.INFORMATION_MESSAGE);
        aString = JOptionPane.showInputDialog(null,
                "Enter a number",JOptionPane.INFORMATION_MESSAGE);
        a = Integer.parseInt(aString);
        bString = JOptionPane.showInputDialog(null,
                "Enter another number.",JOptionPane.INFORMATION_MESSAGE);
        b = Integer.parseInt(bString);

        c = a + b;

    }
}
