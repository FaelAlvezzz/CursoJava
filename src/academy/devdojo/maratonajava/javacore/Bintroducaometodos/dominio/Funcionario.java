package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];


    public void mediaSalarios() {
        double mediaSalarios = (salarios[0] + salarios[1] + salarios[2])/2;
        System.out.println("A sua media salarial é " + "R$"+mediaSalarios);
    }

    public void imprime(){
            System.out.println("------------------------");
            System.out.println(this.nome);
            System.out.println(this.idade);
            System.out.println("Salário 01: " + "R$"+this.salarios[0]);
            System.out.println("Salário 02: " + "R$"+this.salarios[1]);
            System.out.println("Salário 03: " + "R$"+this.salarios[2]);
    }
}
