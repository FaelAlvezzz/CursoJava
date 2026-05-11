package academy.devdojo.maratonajava.javacore.Gassoiacao.test;

import academy.devdojo.maratonajava.javacore.Gassoiacao.domain.Escola;
import academy.devdojo.maratonajava.javacore.Gassoiacao.domain.Professor;

public class EscolaTest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Roberto");
        Professor professor2 = new Professor("Claudia");
        Professor[] professores ={professor1, professor2};
        Escola escola = new Escola("Pedro Américo", professores);

        escola.imprime();
    }

}
