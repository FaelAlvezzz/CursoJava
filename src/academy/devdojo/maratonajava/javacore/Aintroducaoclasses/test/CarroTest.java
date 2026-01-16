package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fusca bala";
        carro1.modelo = "Sport";
        carro1.ano = 1979;

        carro2.nome = "Fiat";
        carro2.modelo = "Uno";
        carro2.ano = 2015;

        carro1 = carro2;

        System.out.println("\nCarro1");
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("-------------------------");

        System.out.println("\nCarro2");
        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
