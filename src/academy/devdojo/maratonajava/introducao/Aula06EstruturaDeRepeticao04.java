package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaDeRepeticao04 {
    // Dado o valor do carro, quero saber em quantas parcelas eu posso pagar
    // Sendo o valorTotal das parcelas > 1000
    static void main(String[] args) {
        double valorTotal = 2000;
        for (int parcela = 1; parcela < valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 100) {
                break;
            }
            System.out.println("Parcela "+ parcela + " R$ " + valorParcela);
        }
    }
}
