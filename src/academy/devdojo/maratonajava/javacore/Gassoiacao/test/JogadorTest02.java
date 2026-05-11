package academy.devdojo.maratonajava.javacore.Gassoiacao.test;

import academy.devdojo.maratonajava.javacore.Gassoiacao.domain.Jogador;
import academy.devdojo.maratonajava.javacore.Gassoiacao.domain.Time;

public class JogadorTest02 {
    static void main(String[] args) {
        Jogador jogador01 = new Jogador("Ronaldo");
        Time time = new Time("Real Madri");

        jogador01.setTime(time);
        jogador01.imprime();
    }
}
