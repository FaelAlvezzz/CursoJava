package academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestaticos.domain.Carro;

public class CarroTest01 {
    static void main(String[] args) {
        Carro c1 = new Carro("BMW", 250);
        Carro c2 = new Carro("Gol", 180);
        Carro c3 = new Carro("Fusca", 120);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
