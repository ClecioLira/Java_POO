package Pratica_9;
public class Livro implements Publicacao{
// Atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

// Metodos Especiais
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return this.totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return this.pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return this.aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return this.leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

// Metodos
    public String detalhes() {
        return "Livro {" + "\ntitulo= " + this.getTitulo() + "\nautor= " + this.getAutor() + "\ntotPaginas= " + this.getTotPaginas() + "\npagAtual= " + this.getPagAtual() + "\naberto= " + this.getAberto() + "\nleitor= " + this.getLeitor().getNome() + "\n}";
    }

// Construtor
    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setTotPaginas(totPaginas);
        this.setAberto(false);
        this.setPagAtual(0);
        this.setLeitor(leitor);
    }

    @Override
    public void abrir() {
        this.setAberto(true);
    }
    @Override
    public void fechar() {
        this.setAberto(false);
    }
    @Override
    public void folhear(int pag) {
        if (pag > this.getTotPaginas()) {
            this.setPagAtual(0);
        } else {
            this.setPagAtual(pag);
        }
    }
    @Override
    public void avancarPag() {
        this.setPagAtual(this.getPagAtual() + 1);
    }
    @Override
    public void voltarPag() {
        this.setPagAtual(this.getPagAtual() - 1);
    }
}
