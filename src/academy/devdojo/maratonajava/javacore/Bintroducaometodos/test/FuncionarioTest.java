package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Rafael";
        funcionario.idade = 31;
        funcionario.salarios = new double[]{3000,4000,6000};

        funcionario.imprime();
        funcionario.mediaSalarios();
    }
}
