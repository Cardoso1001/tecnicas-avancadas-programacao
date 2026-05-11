
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        Endereco e = new Endereco("Rua","Bairro","City");
        Pessoa p = new Pessoa("Nome",e);

        JOptionPane.showMessageDialog(null, 
                "Nome: " + p.getNome() +
                "\nRua: " + p.getEndereco().getRua() +
                "\nBairro: " + p.getEndereco().getBairro() +
                "\nCidade: " + p.getEndereco().getCidade()
        );
    }
    
}
