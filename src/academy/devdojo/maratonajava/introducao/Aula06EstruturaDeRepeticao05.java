package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao05 {
    static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}

// O continue ele não ler nada abaixo dele, então sempre tem que está acima do código
//Para que ele não entre em um looping de código.