package Pratica_4;

public class aula_4 {
    public static void main(String[] args) {
// instanciar classe caneta
// criando o objeto c1
        Caneta c1 = new Caneta("NIC", "Amarelo", 0.4f, true);
        c1.status();
        Caneta c2 = new Caneta("BIC", "Azul", 0.6f, false);
        c2.status();
    }
}
