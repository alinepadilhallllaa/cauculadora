package calculadora;
import javax.swing.*;


public class calculadora {
   public static void main(String[] args) {
      
      String numA = JOptionPane.showInputDialog(null, "Digite o primeiro número:");
      String numB = JOptionPane.showInputDialog(null, "Digite o segundo número:");
      //transfomando os Strings em Inteiros
      double a = Double.parseDouble(numA);
      double b = Double.parseDouble(numB);
      //calculando
      double soma = a + b;
      double sub = a - b;
      double mul = a * b;
   }
}	