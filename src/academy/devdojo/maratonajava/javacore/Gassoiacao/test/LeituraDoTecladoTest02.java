package academy.devdojo.maratonajava.javacore.Gassoiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=========Jogo de adivinhação!!=========");
        System.out.println("Digite sua pergunta e eu responderei SIM ou NÃO");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NÃO");
        }
    }
}
