
package exemplosuper;

public class Cliente extends Pessoa {
    private double saldo;
    
    //Construtor padrão
    public Cliente(){
        //Precisa de um construtor padrão, assim como esse, para não precisar passar pelo contrutor de antes
    }
    
    //Contrutor de classe filha, tem que usar "super"!!!
    public Cliente(double saldo, String nome){
        super(nome);
        //Comando que permite passar o valor "nome" para o construtor da classe pai, Pessoa
        this.saldo = saldo;
        
    }
    
    public static void main(String args[]){
        Cliente c = new Cliente();
        Cliente C = new Cliente(250, "jão");
        
    }
    
}
