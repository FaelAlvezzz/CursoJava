package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    static void main() {
        Calculadora calculadora = new Calculadora();
        calculadora.multiplicaDoisNumeros(10, 20);
        System.out.println("Finalizando multiplicação de dois numeros");
    }
}
