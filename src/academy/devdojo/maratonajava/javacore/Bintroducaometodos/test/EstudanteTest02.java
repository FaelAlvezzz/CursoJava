package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;

public class EstudanteTest02 {
    static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();


        estudante01.nome = "Rafael";
        estudante01.idade = 31;
        estudante01.sexo = 'M';

        estudante02.nome = "Jorge";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
