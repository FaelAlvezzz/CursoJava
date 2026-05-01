package academy.devdojo.maratonajava.javacore.Dconstrutores.test;

import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest {
    static void main(String[] args) {
        Anime anime = new Anime("Naruto", "TV", 12, "Ação", "Toye");
        anime.imprime();
    }
}
