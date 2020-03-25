import javax.swing.JOptionPane;

public class Aula03Ex1 {
   public static void main (String arg[]){
      int n1, n2, n3;
      n1 = Integer.parseInt(JOptionPane.showInputDialog ("digite primeiro numero:"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog ("digite segundo numero:"));
      n3 = n1 + n2;
      if (n3 > 10){
         JOptionPane.showMessageDialog (null, n3);
      }
   }
}