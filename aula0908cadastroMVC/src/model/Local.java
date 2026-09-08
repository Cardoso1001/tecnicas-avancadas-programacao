
package model;

import javax.swing.JOptionPane;

public class Local {
    private String nomelocal;
    private String localpai;
    private String tipolocal;
    private String descricao;

    public String getNomelocal() {
        return nomelocal;
    }

    public void setNomelocal(String nomelocal) {
        this.nomelocal = nomelocal;
    }

    public String getLocalpai() {
        return localpai;
    }

    public void setLocalpai(String localpai) {
        this.localpai = localpai;
    }

    public String getTipolocal() {
        return tipolocal;
    }

    public void setTipolocal(String tipolocal) {
        this.tipolocal = tipolocal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean gravar(){
        JOptionPane.showMessageDialog(null, 
                "Local: " + getNomelocal() +
                "\nLocal pai: " + getLocalpai() +
                "\nTipo: " + getTipolocal() + 
                "\nDescrição: " + getDescricao()
        );
        
        return true;
    }
    
    
}
