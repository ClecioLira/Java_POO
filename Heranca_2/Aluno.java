package Heranca_2;

public class Aluno extends Pessoa {
// Atributos
    private int matricula;
    private String curso;

// Metodos
    public void PagarMensalidade() {
        System.out.println("Sua mensalidade foi paga.");
    }

// Metodos especiais
    public int getMatricula() {
        return this.matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
}
