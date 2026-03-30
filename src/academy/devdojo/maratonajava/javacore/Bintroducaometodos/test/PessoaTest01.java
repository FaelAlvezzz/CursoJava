package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jorge");
        pessoa.setIdade(35);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
