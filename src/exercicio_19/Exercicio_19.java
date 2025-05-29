package exercicio_19;

import javax.swing.JOptionPane;

/**
 *
 * @author Lorenzo
 */
public class Exercicio_19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int r;
        String frase = JOptionPane.showInputDialog("Qual a sua frase: ");
        r = Integer.parseInt(JOptionPane.showInputDialog("Qauntas vezes ela vai se repetir: "));
        for (int i = 0; i < r; i++) { //i = 0, vai de 0 até um numero antes do r
            JOptionPane.showMessageDialog(null, "A sua frase é: " + frase);
        }
    }
}
