import javax.swing.JOptionPane;

public class BoasVindas 
{

    public static void main(String args[])
    {
       JOptionPane.showMessageDialog(null, "Olá mundo !");
       
       
       String nome;
       int idade;
       double altura;
       
       nome = JOptionPane.showInputDialog("Digite seu nome: ");
       idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade: "));
       altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura: "));
       
       String mensagem = "*** Dados do Aluno ***"
               +"\nNome é " + nome
               +"\nIdade é " + idade
               +"\nAltura é " + altura;
       JOptionPane.showMessageDialog(null, mensagem);
    }
    
}
