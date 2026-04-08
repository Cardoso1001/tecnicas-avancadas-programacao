package atv8;
public class Vendedor extends Empregado{
    private double valorVendas;
    private int qtdVendas;

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public void setQtdVendas(int qtdVendas) {
        this.qtdVendas = qtdVendas;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public int getQtdVendas() {
        return qtdVendas;
    }
    
}
