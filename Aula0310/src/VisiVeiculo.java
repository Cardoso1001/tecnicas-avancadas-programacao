
import javax.swing.JOptionPane;


public class VisiVeiculo {
    public static void main(String args[]){
        Veiculo v = new Veiculo();
        v.setMarca("Ferari");
        v.getMarca();
        
        JOptionPane.showMessageDialog(null, v.getMarca());
        
    }
}
