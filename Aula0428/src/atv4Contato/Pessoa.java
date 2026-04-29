/*
Escreva uma classe chamada Pessoa que represente os dados de uma pessoa:
nome, data de aniversário e endereço. 
Crie outra classe, chamada Contato, que herde Pessoa e estipule os atributos telefone e email.
Criar os getters, setters e os construtores que inicializem os atributos (aplicar o comando super).

Utilize interface JFrame para que o usuário interaja com o sistema.
 
 */
package atv4Contato;

public class Pessoa {
    private String nome;
    private String niver;
    private String endereco;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNiver(String niver) {
        this.niver = niver;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getNiver() {
        return niver;
    }

    public String getEndereco() {
        return endereco;
    }
    
    public Pessoa(String nome, String niver, String endereco){
        this.nome = nome;
        this.niver = niver;
        this.endereco = endereco;
    
    }
    public Pessoa(){
        
    }
    
}
