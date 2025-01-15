import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in); // classe para entrar com dados

        System.out.println("digite seu filme favorito");
        String filme = leitura.nextLine(); // para digitar algo no console

        System.out.println("qual ano de lançamento?");
        int anoDeLancaamento = leitura.nextInt();

        System.out.println("que nota você da para o filme?");
        double avaliacao = leitura.nextDouble();

        System.out.println("Seu filme favorito é " + filme +" do ano " + anoDeLancaamento + " com nota de avaliação: " + avaliacao);
    }
}
