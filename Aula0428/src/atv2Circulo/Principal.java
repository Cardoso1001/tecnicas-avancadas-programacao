
package atv2Circulo;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]){
        Circulo c = new Circulo(10);
        JOptionPane.showMessageDialog(null, "A área = " + c.getArea(c.getRaio()));
        JOptionPane.showMessageDialog(null, "A circunferencia = " + c.getCircunferencia(c.getRaio()));
        JOptionPane.showInputDialog("Raio atual = " + c.getRaio() + "\nAumentar em quantos %?");
    }
}
