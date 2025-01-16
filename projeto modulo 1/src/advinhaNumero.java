import java.util.Random;
import java.util.Scanner;

public class advinhaNumero {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // numero gerado rondomicamente
        int contador = 0;
        int numeroDigitado = 0;


        while (contador < 5) {

            System.out.println("Advinhe o numero?");
            numeroDigitado = leitura.nextInt();
            contador++;

            if (numeroDigitado == numeroGerado) {
                System.out.println("Parabens você acertou! O numero foi " + numeroGerado);
                break;

            } else if (numeroDigitado > numeroGerado) {
                System.out.println("O numero gerado é menor, tente de novo!");

            } else if (numeroDigitado < numeroGerado) {
                System.out.println("O numero gerado é maior, tente de novo!");

            }

            if ( contador == 5 && numeroDigitado != numeroGerado){
                System.out.println("Tentou 5 vezes, tente depois! O numero foi " + numeroGerado);
            }

        }
    }
}






