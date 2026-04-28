/*
Crie uma classe Veiculo com: modelo, marca, ano, cor, valor. 
Preencha os dados e exiba o valor do veículo acrescido de 5% do seu valor. 
Utilize um construtor para setar os dados no momento da instância.
*/
package atv1Veiculo;;

import javax.swing.JOptionPane;

public class Veiculo {
    private String modelo, marca, ano, cor;
    private double valor;
    
    public Veiculo(String modelo, String marca, String ano, String cor, double valor){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.cor = cor;
        //5% de acréssimo no valor
        this.valor = valor * 1.05;
    }
    
    public static void main(String args[]){
        Veiculo v = new Veiculo("Monza", "VolksWagen", "1986", "Preto", 100.0);
        JOptionPane.showMessageDialog(null, v.valor);
    }
}
