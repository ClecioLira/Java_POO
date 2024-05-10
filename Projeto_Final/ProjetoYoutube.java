package Projeto_Final;

public class ProjetoYoutube {
    public static void main(String[] args) {
        Video v[] = new Video[3];
        v[0] = new Video("Aula 1 de POO", 0, 0, 0, false);
        v[1] = new Video("Aula 12 de PHP", 0, 0, 0, false);
        v[2] = new Video("Aula 10 de HTML5", 0, 0, 0, false);

        Gafanhoto g[] = new Gafanhoto[2];
        g[0] = new Gafanhoto("Clécio", 22, "M", 0, "Cridan");

        Visualizador vis[] = new Visualizador[3];
        vis[0] = new Visualizador(g[0], v[0]);
        vis[0].Avaliar();
        vis[1] = new Visualizador(g[0], v[1]);
        vis[1].Avaliar(8);
        vis[2] = new Visualizador(g[0], v[2]);
        vis[2].Avaliar(35.0f);
        System.out.println(vis[0].toString());
        System.out.println(vis[1].toString());
        System.out.println(vis[2].toString());
    }
}
