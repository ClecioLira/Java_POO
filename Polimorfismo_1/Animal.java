package Polimorfismo_1;

public abstract class Animal {
// Atributos
    protected double peso;
    protected int idade;
    protected int membros;

// Metodos
    public abstract void Locomover();

    public abstract void Alimentar();

    public abstract void EmitirSom();

// Metodos Especiais
    public double getPeso() {
        return this.peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return this.idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getMembros() {
        return this.membros;
    }
    public void setMembros(int membros) {
        this.membros = membros;
    }
}
