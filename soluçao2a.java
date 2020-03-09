import javax.swing.JOptionPane;

public class soluçao2a{
   public static void main(String[] args)
   {
      int dia;
      int mês;
      int ano;
      
      dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
      mês = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
      ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
      
      System.out.println(dia + "/" + mês + "/" + ano);
         
   }
}