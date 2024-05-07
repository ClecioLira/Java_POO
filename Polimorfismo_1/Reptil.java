package Polimorfismo_1;

public class Reptil extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return this.corEscama;
    }
    public void setCorDaEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void Locomover() {
        System.out.println("Rastejando");
    }
    @Override
    public void Alimentar() {
        System.out.println("Comendo vegetais");
    }
    @Override
    public void EmitirSom() {
        System.out.println("Som de reptil");
    }
}