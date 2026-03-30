package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios = new double[3];

    public void imprime(){
            System.out.println("------------------------");
            System.out.println(this.nome);
            System.out.println(this.idade);
            if (salarios == null){
                return;
            }
            for (double salario: salarios){
                System.out.print(salario + " ");
            }

            imprimeMediaSalario();

            System.out.println("Salário 01: " + "R$"+this.salarios[0]);
            System.out.println("Salário 02: " + "R$"+this.salarios[1]);
            System.out.println("Salário 03: " + "R$"+this.salarios[2]);
    }

    public void imprimeMediaSalario(){
        if(salarios == null) {
            return;
        }

        double media = 0;

        for (double salario: salarios){
            media += salario;
        }

        media /= salarios.length;

        System.out.println("\n media salarial " + media);
    }
}
