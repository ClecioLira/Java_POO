package Polimorfismo_1;

public class Peixe extends Animal {
    private String corEscama;

    public String getCorEscama() {
        return this.corEscama;
    }
    public void setCorDaEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    public void SoltarBolha() {
        System.out.println("Soltou uma bolha");
    }

    @Override
    public void Locomover() {
        System.out.println("Nadando");
    }
    @Override
    public void Alimentar() {
        System.out.println("Comendo substancias");
    }
    @Override
    public void EmitirSom() {
        System.out.println("Peixe não faz som");
    }
}
