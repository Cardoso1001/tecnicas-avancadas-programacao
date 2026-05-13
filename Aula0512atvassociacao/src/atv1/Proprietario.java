package atv1;

public class Proprietario extends Pessoa {
    private String conjuge;

    public String getConjuge() {
        return conjuge;
    }

    public void setConjuge(String conjuge) {
        this.conjuge = conjuge;
    }
    
    public Proprietario (String n, String cpf, String c) {
        super.setNome(n);
        super.setCpf(cpf);
        this.conjuge = c;
        
    }
    
}
