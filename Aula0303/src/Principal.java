
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String args[]){
        Aluno a = new Aluno();
 
        //String nome = "Zé", dataNasc = "01/01/2001", cpf = "111.222.333-00", ra = "123"; 
        String nome, dataNasc, cpf, ra;
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        dataNasc = JOptionPane.showInputDialog("Digite a data de nascimento: ");
        cpf = JOptionPane.showInputDialog("Digite o cpf: ");
        ra = JOptionPane.showInputDialog("Digite o RA: ");
        //System.out.println(nome + dataNasc + cpf + ra);
        a.cadastrar(nome, dataNasc, cpf, ra);
        System.out.println(a.nome + a.dataNasc + a.cpf + a.ra);
        
        
        //System.out.println(" Boo ");
        //System.out.println(a.nome.);
        
    }
}
