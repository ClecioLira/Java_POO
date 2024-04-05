package Pratica_3;

// public = todos podem mexer
// private = apenas os que estão dentro da classe que podem mexer
// protected = apenas a mãe e seus filhos que podem mexer

// criando a classe caneta
public class Caneta {
// atributos
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

// metodos
    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Seu modelo é: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO: A caneta está tampada, não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar() {
        this.tampada = false;
    }
}
