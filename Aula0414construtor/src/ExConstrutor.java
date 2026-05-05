
import javax.swing.JOptionPane;

public class ExConstrutor {
    private int numero;
    
    //Método especial executado somente no momento da instancia:
    // mesmo nome da classe
    //publico
    //pode ter mais de um Construtor
    public ExConstrutor(){
        numero = 0;
        JOptionPane.showMessageDialog(null, "Passou por esse construtor!");
    }
    
    //O que difere um construtor do outro é os PARAMETROS
    public ExConstrutor(int n){
        numero = n;
        JOptionPane.showMessageDialog(null, "Passou por esse OUTRO construtor!");
    }
    
    public static void main(String args[]){
        
        //Aqui, dependendo do que vc colocar dentro, muda de construtor por causa do parametro
        ExConstrutor c = new ExConstrutor(120);
        
        
    }

}
