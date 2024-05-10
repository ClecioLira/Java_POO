package Projeto_Final;

public class Gafanhoto extends Pessoa {
    private String login;
    private int totAssistindo;

    public Gafanhoto(String nome, int idade, String sexo, float experiencia, String login) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistindo = 0;
    }

    public String getLogin() {
        return this.login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistindo() {
        return this.totAssistindo;
    }
    public void setTotAssistindo(int totAssistindo) {
        this.totAssistindo = totAssistindo;
    }
    
    @Override
    public String toString() {
        return  "\nGafanhoto:" + 
                "\nNome: " + this.getNome() +
                "\nIdade: " + this.getIdade() +
                "\nSexo: " + this.getSexo() +
                "\nExperiência: " + this.getExperiencia() +
                "\nLogin: " + this.getLogin() +
                "\nTotal Assistido: " + this.getTotAssistindo();
    }
}
