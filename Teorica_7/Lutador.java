package Teorica_7;

public class Lutador {
// ATRIBUTOS
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

// METODO CONSTRUTOR
    public Lutador(
        String nome,
        String nacionalidade,
        int idade,
        float altura,
        float peso,
        int vitorias,
        int derrotas,
        int empates) {
            this.setNome(nome);
            this.setNacionalidade(nacionalidade);
            this.setIdade(idade);
            this.setAltura(altura);
            this.setPeso(peso);
            this.setVitorias(vitorias);
            this.setDerrotas(derrotas);
            this.setEmpates(empates);
    }

// METODOS ESPECIAIS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }
    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }
    private void setCategoria() {
        if (this.getPeso() < 52.2) {
            this.categoria = "Invalido";
        } else if (this.getPeso() <= 70.3) {
            this.categoria = "Peso Leve";
        } else if (this.getPeso() <= 83.9) {
            this.categoria = "Peso Médio";
        } else if (this.getPeso() <= 120.2) {
            this.categoria = "Peso Pesado";
        } else {
            this.categoria = "Invalido";
        }
    }

    public int getVitorias() {
        return vitorias;
    }
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }
    public void setEmpates(int empates) {
        this.empates = empates;
    }

// METODOS
    public void ganharLuta() {
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta() {
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(getEmpates() + 1);
    }

    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando: " + this.getPeso() + "Kg");
        System.out.println("Ganhou: " + this.getVitorias());
        System.out.println("Perdeu: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
        System.out.println("");
    }

    public void status() {
        System.out.println(getNome());
        System.out.println("É da categoria " + this.getCategoria());
        System.out.println(getVitorias() + " Vitorias");
        System.out.println(getDerrotas() + " Derrotas");
        System.out.println(getEmpates() + " Empates");
        System.out.println("");
    }
}
