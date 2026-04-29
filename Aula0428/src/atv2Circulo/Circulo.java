/*
Escreva uma classe Circulo para representar círculos. Esta classe deverá conter os seguintes atributos e métodos:
Uma variável privada do tipo double chamada raio que guardará o valor do raio atual do círculo.

Métodos get() e set() públicos que permitem definir e acessar o valor da variável raio.

Um construtor que recebe o valor do raio como argumento.

Um método getArea() que calcula e retorna a área do círculo.

Um método getCircunferencia() que calcula e retorna a circunferência do círculo.

Um método aumentarRaio() que recebe um valor double e o usa como percentual para aumentar o raio do círculo.

Crie uma classe contendo um método main() para testar a funcionalidade da classe Circulo.
 */
package atv2Circulo;

public class Circulo {
    private double raio;

    // Construtor
    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return Math.PI * raio * raio;  // Utilizando Math.PI para maior precisão
    }

    public double getCircunferencia() {
        return 2 * Math.PI * raio;  // Utilizando Math.PI para maior precisão
    }

    // Método para aumentar o raio com base em um percentual
    public void aumentarRaio(double percentual) {
        this.raio = this.raio + (this.raio * percentual / 100);
    }
}