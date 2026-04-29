package atv2Circulo;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String args[]) {
        Circulo c = new Circulo(10);
        
        JOptionPane.showMessageDialog(null, "A área = " + c.getArea());
        JOptionPane.showMessageDialog(null, "A circunferência = " + c.getCircunferencia());
        
        c.aumentarRaio(Double.parseDouble(JOptionPane.showInputDialog("Raio atual = " + c.getRaio() + "\nAumentar em quantos %?")));
            
        JOptionPane.showMessageDialog(null, "Raio atual = " + c.getRaio() + "\nA área = " + c.getArea() + "\nA circunferência = " + c.getCircunferencia());
        
    }
}