package Heranca_2;

public class Professor extends Pessoa {
// Atributos
    private String especialidade;
    private double salario;

// Metodos
    public void AumentarSalario(float aumento) {
        this.salario = salario + aumento;
    }

// Metodos especiais
    public String getEspecialidade() {
        return this.especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return this.salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}
