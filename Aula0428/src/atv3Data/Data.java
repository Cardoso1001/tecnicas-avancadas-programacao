/*
Crie uma classe para representar datas que serão usados três atributos: o dia, o mês, e o ano.
Sua classe deve ter um construtor que inicializa os três atributos.
Crie um segundo construtor sem parâmetros que inicializa a data com a data atual
fornecida pelo sistema operacional (pesquisar o comando que captura a data do sistema).
Forneça um método set e um get para cada atributo.
Crie um método para exibir a data mostrando o dia, o mês e o ano separados por barra (/).
Possibilite que o usuário digite e visualize os valores usando JOptionPane.
 */

package atv3Data;

import java.util.Calendar;
import javax.swing.JOptionPane;



public class Data {
    private int dia;
    private int mes;
    private int ano;
    
    public void setDia(int dia) {
        this.dia = dia;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }
    public int getMes() {
        return mes;
    }
    public int getAno() {
        return ano;
    }
    
    public Data(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public Data(){
        Calendar data = Calendar.getInstance();
        
        this.dia = data.get(Calendar.DAY_OF_MONTH);
        this.mes = data.get(Calendar.MONTH);
        this.ano = data.get(Calendar.YEAR);
    }

    
    public void mostrarData(){
        JOptionPane.showMessageDialog(null, dia + "/" + mes + "/" + ano);
    }
    
    public static void main(String args[]){
        Data d = new Data();
        
        d.mostrarData();
        
        d.setDia(Integer.parseInt(JOptionPane.showInputDialog("Dia: ")));
        d.setMes(Integer.parseInt(JOptionPane.showInputDialog("Mes: ")));
        d.setAno(Integer.parseInt(JOptionPane.showInputDialog("Ano: ")));
        
        d.mostrarData();
        
    }
}
