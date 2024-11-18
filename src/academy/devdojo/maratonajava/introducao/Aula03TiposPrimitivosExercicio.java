package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        /*Prática

        Crie variaveis  para os campos  descritos abaixo entre < > e imprima a seguinte mensagem:
        Eu < >, morando no endereço <endereço>,
        confirmo que recebi o sálario de <salario>confirmo que recebi o sálario na <data>
        */

        String nome = "Felipe";
        String endereco = "av centro";
        double salario = 1500.00;
        String data = "20/10/2020";
        String descricao = "Eu "+nome+ ", morando no endereço "+endereco+", confirmo que recebi o sálario de "+salario+" na data "+data;
        System.out.println(descricao);
    }
}
