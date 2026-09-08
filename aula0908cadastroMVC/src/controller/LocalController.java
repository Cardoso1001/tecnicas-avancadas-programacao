
package controller;

import model.Local;

public class LocalController {
    
    public boolean efetuarGravacao(String nome, String pai, String tipo, String desc){
        Local l = new Local();
        l.setNomelocal(nome);
        l.setLocalpai(pai);
        l.setTipolocal(tipo);
        l.setDescricao(desc);
        
        return l.gravar();
    }
}
