package atv1;

public class Inquilino extends Pessoa {
    private double renda;
    private String profissao;

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
    
    public Inquilino (String n, String cpf, String p, double r) {
        super.setNome(n);
        super.setCpf(cpf);
        this.profissao = p;
        this.renda = r;
    }
    
}
