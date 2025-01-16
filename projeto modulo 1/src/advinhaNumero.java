import java.util.Random;
import java.util.Scanner;

public class advinhaNumero {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(100); // numero gerado rondomicamente
        int contador = 0;
        int numeroDigitado = 0;


        while (numeroDigitado != -1 && contador < 5) {

            if (numeroDigitado != numeroGerado) {
                System.out.println("Advinhe o numero ?");
                numeroDigitado = leitura.nextInt();
                contador++;
            } else {
                System.out.println("você acertou!!! O numero correto é " + numeroGerado + "!");
                break;
            }
        }
        System.out.println("você tentou 5 vezes! Tente depois. O numero era "+ numeroGerado);
    }
}


