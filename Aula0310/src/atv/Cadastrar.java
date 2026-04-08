
import javax.swing.JOptionPane;


public class Cadastrar {
    public static void main(String args[]){
        Aluno a = new Aluno();
        a.setNome(JOptionPane.showInputDialog( "Insira o nome aluno: "));
        a.setRA(JOptionPane.showInputDialog( "Insira o RA aluno: "));
        
        JOptionPane.showMessageDialog(null, "Nome: " + a.getNome() + "\nRA: " + a.getRA());
    }
}
