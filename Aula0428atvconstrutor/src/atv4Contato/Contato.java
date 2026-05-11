
package atv4Contato;

public class Contato extends Pessoa {
    private String telefone;
    private String email;

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }
    
    public Contato(String nome, String niver, String endereco, String telefone, String email){
        super(nome,niver,endereco);
        this.email = email;
        this.telefone = telefone;
        
    }
}
