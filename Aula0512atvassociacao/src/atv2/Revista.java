/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atv2;

/**
 *
 * @author 55149
 */
public class Revista extends Publicacao {
    private String num_ed;

    public Revista(String titulo, String ano, String num_ed) {
        super(titulo,ano);
        this.num_ed = num_ed;
    }

    public String getNum_ed() {
        return num_ed;
    }

    public void setNum_ed(String num_ed) {
        this.num_ed = num_ed;
    }
    
}
