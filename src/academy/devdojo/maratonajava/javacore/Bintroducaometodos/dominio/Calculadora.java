package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(21 - 2);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return (num1/num2);
    }

    public double dividiDoisNumeros02(double num1, double num2){
        if (num2 != 0){
            return (num1 / num2);
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0){
            System.out.println("Não existe divisão por zero!!");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int numero1, int numero2) {
        numero1 = 42;
        numero2 = 73;
        System.out.println("Dentro do alterarDoisNumeros");
        System.out.println("Numero1: "+numero1);
        System.out.println("Numero2: "+numero2);
    }

    public void somarArray(int [] numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }

    public void somaVarargs(int... numeros){
        int soma = 0;
        for(int num : numeros){
            soma += num;
        }
        System.out.println(soma);
    }
}
