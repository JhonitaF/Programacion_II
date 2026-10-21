import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    private int numeroAAdivinar;
    private static final Scanner TECLADO = new Scanner(System.in);
    private Random azar = new Random();

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = azar.nextInt(11); // 0..10
        System.out.println("Adivina un numero entre 0 y 10:");
        while (true) {
            int numero = TECLADO.nextInt();
            if (numero == numeroAAdivinar) {
                System.out.println("Acertaste!!");
                actualizaRecord();
                return;
            }
            if (quitaVida()) {
                if (numeroAAdivinar > numero) {
                    System.out.println("El numero a adivinar es mayor.");
                } else {
                    System.out.println("El numero a adivinar es menor.");
                }
                System.out.println("Intentalo de nuevo:");
            } else {
                System.out.println("El numero era " + numeroAAdivinar + ".");
                return;
            }
        }
    }
}
