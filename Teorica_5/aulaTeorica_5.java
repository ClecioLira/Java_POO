package Teorica_5;

public class aulaTeorica_5 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(111);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2222);
        p2.setDono("Creusa");
        p2.abrirConta("CP");

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
