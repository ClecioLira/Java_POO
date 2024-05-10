package Projeto_Final;

public class Visualizador {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizador(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistindo(this.espectador.getTotAssistindo() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    public void Avaliar() {
        this.filme.setAvaliacao(5);
    }

    public void Avaliar(int nota) {
        this.filme.setAvaliacao(nota);
    }

    public void Avaliar(float porc) {
        int tot = 0;
        if (porc <= 20) {
            tot = 3;
        } else if (porc <= 50) {
            tot = 5;
        } else if (porc <= 90) {
            tot = 8;
        } else {
            tot = 10;
        }
        this.filme.setAvaliacao(tot);
    }

    public Gafanhoto getEspectador() {
        return this.espectador;
    }
    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }
    public void setFilme(Video filme) {
        this.filme = filme;
    }

    @Override
    public String toString() {
        return  "\nVisualizador: " +
                "\nEspectador: " + this.getEspectador() +
                "\nFilme: " + this.getFilme();
    }
}
