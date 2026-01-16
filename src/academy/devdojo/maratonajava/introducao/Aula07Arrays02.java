package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        //char = '\u0000' ou ' '
        //boolean = false
        //String = null
        //Faça os testa para ver os resultados de cada references
        String [] nomes = new String[3];
        nomes[0] = "Helena";
        nomes[2] = "Bruna";
        nomes[1] = "Rafael";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
