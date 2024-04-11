package Teorica_7;
import java.util.Random;

public class Luta {
// ATRIBUTOS
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
// METODOS ESPECIAIS
    public Lutador getDesafiado() {
        return this.desafiado;
    }
    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }
    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }
    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return this.aprovada;
    }
    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

// METODOS
    public void marcarLuta(Lutador L1, Lutador L2) {
        if (L1.getCategoria() == L2.getCategoria() && L1 != L2) {
            this.setAprovada(true);
            this.setDesafiado(L1);
            this.setDesafiante(L2);
        } else {
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            this.getDesafiado().apresentar();
            this.getDesafiante().apresentar();
            
            Random aleatorio = new Random();
            int vencedor = aleatorio.nextInt(3);

            switch (vencedor) {
                case 0:
                    System.out.println("Empatou");
                    System.out.println("");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("O " + getDesafiado().getNome() + " Ganhou!");
                    System.out.println("");
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2:
                    System.out.println("O " + getDesafiante().getNome() + " Ganhou!");
                    System.out.println("");
                    this.getDesafiado().perderLuta();
                    this.getDesafiante().ganharLuta();
                    break;
            }
        } else {
            System.out.println("Luta não pode acontecer.");
        }
    }
}
