
package ws.unisul15;
import javax.swing.JOptionPane;
public class Unisul15 {

    public static void main(String[] args) {
       String nome = JOptionPane.showInputDialog("Qual seu nome?");
       int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
       
       if (idade >= 15 && idade <= 25) {
           JOptionPane.showMessageDialog(null, "ACEITA");
       }
       else {
           JOptionPane.showMessageDialog(null, "NÃO ACEITA");
       }
    }
}
