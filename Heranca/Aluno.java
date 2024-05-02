package Heranca;

public class Aluno extends Pessoa {
// Atributos
    private int matricula;
    private String curso;

// Metodos
    public void CancelarMatricula() {
        System.out.println("Sua matricula será cancelada.");
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
