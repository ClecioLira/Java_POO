package Polimorfismo_1;

public class Ave extends Animal {
    private String corPena;

    public String getCorPena() {
        return this.corPena;
    }
    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    public void FazerNinho() {
        System.out.println("Construindo um ninho");
    }

    @Override
    public void Locomover() {
        System.out.println("Voando");
    }
    @Override
    public void Alimentar() {
        System.out.println("Comendo frutas");
    }
    @Override
    public void EmitirSom() {
        System.out.println("Som de ave");
    }
}
