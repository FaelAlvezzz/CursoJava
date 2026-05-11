package academy.devdojo.maratonajava.javacore.Gassoiacao.test;

import academy.devdojo.maratonajava.javacore.Gassoiacao.domain.Jogador;

public class JogadorTest01 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Ronaldinho");
        Jogador jogador2 = new Jogador("Ronaldo");
        Jogador jogador3 = new Jogador("Rivaldo");
        Jogador[] jogadores = new Jogador[]{jogador1, jogador2, jogador3};
        for (Jogador jogadore : jogadores) {
            jogadore.imprime();
        }

    }

}
