package Heranca;

public class ProgramaPrincipal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Pedro");
        p1.setIdade(18);
        p1.setSexo("Masculino");

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
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
