package Heranca_2;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Visitante p4 = new Visitante();

        p2.setNome("Flavio");
        p2.setIdade(55);
        p2.setSexo("Masculino");
        p2.setCurso("Informatica");

        p3.setNome("Maria");
        p3.setIdade(18);
        p3.setSexo("Feminino");
        p3.setSalario(2500.75);

        p4.setNome("Juselia");
        p4.setIdade(62);
        p4.setSexo("Feminino");

        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
