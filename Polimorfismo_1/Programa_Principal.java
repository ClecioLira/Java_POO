package Polimorfismo_1;

public class Programa_Principal {
    public static void main(String[] args) {
        Mamifero m = new Mamifero();
        Reptil r = new Reptil();
        Peixe p = new Peixe();
        Ave a = new Ave();

        m.setPeso(35);
        m.setCorDoPelo("Marrom");
        m.setIdade(4);
        m.setMembros(4);
        m.Alimentar();
        m.Locomover();
        m.EmitirSom();

        a.Locomover();
        p.Locomover();
        r.Locomover();

        Canguru canguru = new Canguru();
        canguru.Locomover();
    }
}
