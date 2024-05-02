package Pratica_9;
public class ProjetoLivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Clécio", 22, "Masculino");
        p[1] = new Pessoa("Mayrla", 19, "Feminino");

        l[0] = new Livro("Aprendendo Java", "Jose da silva", 300, p[0]);
        l[1] = new Livro("Aprendendo HTML", "Fernando Rio", 200, p[1]);

        l[1].abrir();
        l[1].folhear(150);
        l[1].avancarPag();
        l[1].avancarPag();
        l[1].avancarPag();
        System.out.println(l[1].detalhes());
    }
}
