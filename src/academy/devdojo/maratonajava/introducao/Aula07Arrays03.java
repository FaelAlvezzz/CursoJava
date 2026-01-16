package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    static void main(String[] args) {
        int [] numeros = new int[5];
        int [] numeros2 = {1, 2, 3, 4, 5};
        int [] numeros3 = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < numeros2.length; i++) {
            System.out.println(numeros2[i]);
        }

        // Este é o ForEACH para ler APENAS o objeto especificado importa
        for (int num: numeros3) {
            System.out.println(num);
        }
    }
}
