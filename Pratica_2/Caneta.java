package Pratica_2;

// criando a classe caneta
public class Caneta {
// atributos
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

// metodos
    void status() {
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Seu modelo é: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("ERRO: A caneta está tampada, não posso rabiscar.");
        } else {
            System.out.println("Estou rabiscando!");
        }
    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }
}
