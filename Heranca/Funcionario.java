package Heranca;

public class Funcionario extends Pessoa {
// Atributos
    private String setor;
    private boolean trabalhando;

// Metodos
    public void MudarTrabalho() {
        this.trabalhando = !this.trabalhando;
    }

// Metodos especiais
    public String getSetor() {
        return this.setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
}
