import javax.swing.JOptionPane;

public class main {
    public static void main(String args[]){
        Funcionario f = new Funcionario();
        
        f.setNome("Zé");
        f.setCPF("123.456.789-00");
        f.setTelefone("(14)98765-4321");
        f.setSalario(1234.99);
        JOptionPane.showMessageDialog(null, f.getNome());
        JOptionPane.showMessageDialog(null, f.getCPF());
        JOptionPane.showMessageDialog(null, f.getTelefone());
    }
}
