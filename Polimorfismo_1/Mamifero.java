package Polimorfismo_1;

public class Mamifero extends Animal{
    private String corDoPelo;

    public String getCorDoPelo() {
        return this.corDoPelo;
    }
    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void Locomover() {
        System.out.println("Correndo");
    }
    @Override
    public void Alimentar() {
        System.out.println("Mamando");
    }
    @Override
    public void EmitirSom() {
        System.out.println("Som de mamifero");
    }
}
