package Teorica_6;

public class ControleRemoto implements Controlador{
// ATRIBUTOS
    private int volume;
    private boolean ligado;
    private boolean tocando;
// METODOS ESPECIAIS
    public ControleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
    }

    private int getVolume() {
        return this.volume;
    }
    private boolean getLigado() {
        return this.ligado;
    }
    private boolean getTocando() {
        return this.tocando;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }
    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }
    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }
// SOBRESCREVENDO METODOS ABSTRATOS
    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        if (this.getLigado() == true) {
            System.out.println("Ligado: " + this.getLigado());
            System.out.println("Tocando: " + this.getTocando());
            System.out.print("Volume: " + this.getVolume() + " ");
            for (int i = 0; i <= this.getVolume(); i += 10) {
                System.out.print("|");
            }
            System.out.println("");
        } else {
            System.out.println("TV Desligada");
        }
    }

    @Override
    public void fecharMenu() {
        if (this.getLigado() == true){
            System.out.println("Fechando menu...");
        } else {
            System.out.println("TV Desligada");
        }
    }

    @Override
    public void maisVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() + 2);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado() == true) {
            this.setVolume(this.getVolume() - 2);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() == true && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() == true && this.getVolume() == 0) {
            this.setVolume(25);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() == true && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() == true && this.getTocando() == true) {
            this.setTocando(false);
        }
    }
}
