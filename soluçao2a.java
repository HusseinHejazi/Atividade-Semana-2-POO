import javax.swing.JOptionPane;

public class solu�ao2a{
   public static void main(String[] args)
   {
      int dia;
      int m�s;
      int ano;
      
      dia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia: "));
      m�s = Integer.parseInt(JOptionPane.showInputDialog("Digite o mes: "));
      ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano: "));
      
      System.out.println(dia + "/" + m�s + "/" + ano);
         
   }
}