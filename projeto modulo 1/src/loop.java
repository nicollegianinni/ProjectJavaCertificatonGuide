import java.util.Scanner;

public class loop {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        double mediaAvaliação = 0;
        double nota =0;

        for (int i = 0; i < 3; i++) {
            System.out.println("que nota você da para o filme?");
            nota = leitura.nextDouble();
            mediaAvaliação += nota;
        }
        System.out.println("Media de avaliação é " + mediaAvaliação/3);

    }
}
