package Pratica_2;

public class aula_2 {
    public static void main(String[] args) {
// instanciar classe caneta
// criando o objeto c1
        Caneta c1 = new Caneta();
// atributos
        c1.modelo = "Bic";
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.carga = 90;
// metodos
        c1.tampar();
        c1.status();
        c1.rabiscar();

// instanciar uma 2 caneta
        Caneta c2 = new Caneta();
// atributos
        c2.modelo = "Compactor";
        c2.cor = "Vermelha";
        c2.ponta = 1.0f;
        c2.carga = 60;
// metodos
        c2.destampar();
        c2.status();
        c2.rabiscar();
    }
}
