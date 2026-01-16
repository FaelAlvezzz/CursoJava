package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();


        estudante01.nome = "Rafael";
        estudante01.idade = 31;
        estudante01.sexo = 'M';

        estudante02.nome = "Jorge";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}

// Nunca alterar o estado do objeto dentro da referencia, fazer uma copia para ai sim alterar a referencia.
