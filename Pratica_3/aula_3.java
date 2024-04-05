package Pratica_3;

public class aula_3 {
    public static void main(String[] args) {
// instanciar classe caneta
// criando o objeto c1
        Caneta c1 = new Caneta();
// atributos
        c1.modelo = "Bic Cristal";
        c1.cor = "Azul";
        // c1.ponta = 0.5f;
        c1.carga = 80;
        // c1.tampada = true;
// metodos
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
