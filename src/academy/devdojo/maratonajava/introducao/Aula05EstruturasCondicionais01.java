package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
     static void main(String[] args) {
        int idade = 17;
        boolean isAutorizadoCompraBebida = idade >= 18;
        // ! Estado de negação
        if(isAutorizadoCompraBebida) {
            System.out.println("Esta autorizado a comprar bebida alcoolica!");
        }else {
            System.out.println("Não está autorizado a comprar bebida alcoolica!!");
        }
        if(!isAutorizadoCompraBebida) {
            System.out.println("Não está autorizado a comprar bebida alcoolica!");
        }
        System.out.println("Fora do if");
    }
}
