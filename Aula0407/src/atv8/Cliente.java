package atv8;
public class Cliente extends Pessoa{
    private double valorDivida;
    private int anoNasc;

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void setAnoNasc(int anoNasc) {
        this.anoNasc = anoNasc;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public int getAnoNasc() {
        return anoNasc;
    }
}
