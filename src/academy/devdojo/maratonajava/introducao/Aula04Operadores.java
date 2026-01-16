package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // Operadores Aritimético
        int num01 = 10;
        int num02 = 20;
        double resultado = num01 / (double) num02;
        System.out.println(resultado);

        // % Operador de resto
        int resto = 21 % 7;
        System.out.println(resto);

        // < > <= >= == != Operadores Lógicos
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIguaVinte = 10 == 20;
        boolean isDezIguaDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10.0;
        System.out.println("IsDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIguaVinte "+isDezIguaVinte);
        System.out.println("isDezIguaDez "+isDezIguaDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        // Operadores Lógicos && (AND) || (or)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;
        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

        double valorContaCorrente = 200;
        double valorContaPoupanca = 10000;
        float valorPS5 = 5000F;
        boolean PS5Compravel = valorContaCorrente > valorPS5 || valorContaPoupanca > valorPS5;
        System.out.println(PS5Compravel);

        // Operadores de atribuição = += -= *= /= %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        //
        int contador = 0;
        contador += 1;
        contador++; // contador + 1
        contador--;
        ++contador;
        --contador;
        System.out.println(contador);
    }
}
