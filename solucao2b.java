import javax.swing.JOptionPane;

public class solucao2b{
   public static void main(String[] args){
      double peso;
      
      peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
      
      System.out.println("O peso informado foi " + peso + " kg");
   
   
   }
}