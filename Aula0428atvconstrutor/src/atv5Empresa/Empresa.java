/*
Crie uma classe chamada Empresa capaz de armazenar os dados de uma empresa 
(Nome, Endereço, Cidade, Estado, CEP e Fone).
Inclua um construtor sem argumentos (padrão)
e um que receba os dados como argumentos e os inicialize.
Instancie a Classe das duas maneiras
 */
package atv5Empresa;


public class Empresa {
    private String nome, endereco, cidade, estado, cep, fone;

    public Empresa(){
        
    }
    public Empresa(String nome, String endereco, String cidade, String estado, String cep, String fone){
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.fone = fone;
    }
    
    
    public static void main(String args[]){
        Empresa e = new Empresa();
        Empresa E = new Empresa("Itau", "Rua 9 de julho", "Ourinhos", "SP", "19999-990", "4002-8922");
    }
    
}
