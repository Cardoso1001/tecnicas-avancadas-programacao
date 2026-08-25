//Receber os dados e jogar em pessoa
package controller;

import model.Pessoa;

public class PessoaController {
    
    public boolean efetuarGravacao(String n, int i){
        Pessoa p = new Pessoa();
        p.setNome(n);
        p.setIdade(i);
        
        return p.gravar();
    }
    
}
