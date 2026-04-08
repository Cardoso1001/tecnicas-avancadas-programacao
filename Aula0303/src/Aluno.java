
public class Aluno {
    //Atributos
    String nome;
    String dataNasc;
    String cpf;
    String ra;
    
    //Métodos
    public void cadastrar(String n, String d, String c, String r){
        //Os parametros aqui são chamados de argumentos
        //n,d,c e r não são instanciamento de variaveis!
        //Ao chamar o método, com os argumentos passados, passa eles para os atributos
        nome = n;
        dataNasc = d;
        cpf = c;
        ra = r;
        
    }
    
    
}
