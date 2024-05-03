package Heranca_2;

public class Bolsista extends Aluno {
// Atributos
    private double bolsa;

// Metodos
    public void RenovarBolsa() {
        System.out.println("Renovando a bolsa do aluno: " + this.getNome());
    }
    @Override
    public void PagarMensalidade() {
        System.out.println(this.getNome() + " É bolsista. Desconto aplicado.");
    }

// Metodos Especiais
    public double getBolsa() {
        return this.bolsa;
    }
    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
}
