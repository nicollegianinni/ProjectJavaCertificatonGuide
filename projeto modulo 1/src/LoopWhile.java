import java.util.Scanner;

public class LoopWhile {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliação = 0;
        double nota = 0;
        int totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("que nota você da para o filme?");
            nota = leitura.nextDouble();

            if (nota != -1) {
                mediaAvaliação += nota;
                totalDeNotas++;
            }
        }
        System.out.println("Media de avaliação é " + mediaAvaliação / totalDeNotas + "quantidade de pessoas votantes: "+ totalDeNotas);
    }
}
