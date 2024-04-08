package Pratica_4;

// criando a classe caneta
public class Caneta {
// atributos
    private String modelo;
    private float ponta;
    private String cor;
    private boolean tampada;

// metodos construtor normalmente tem o mesmo nome da classe
    public Caneta(String m, String c, float p, boolean t) {
        this.setCor(c);;
        this.setModelo(m);;
        this.setPonta(p);;
        this.setTampada(t);
    }

// metodos
// os metodos getters e setters vão "proteger" os atributos
// os getters são usados para retornar o valor e mostra-lo
    public String getModelo() {
        return this.modelo;
    }
    public float getPonta() {
        return this.ponta;
    }
    public String getCor() {
        return this.cor;
    }
    public boolean getTampada() {
        return this.tampada;
    }

// os setters são usados para modificar o valor
    public void setModelo(String m) {
        this.modelo = m;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void setCor(String c) {
        this.cor = c;
    }
    public void setTampada(boolean t) {
        if (t == true) {
            this.tampada = true;
        } else {
            this.tampada = false;//////
        }
    } 

    public void status() {
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Tampada: " + this.getTampada());
    }

}
