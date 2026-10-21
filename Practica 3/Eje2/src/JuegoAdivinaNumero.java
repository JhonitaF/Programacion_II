import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinaNumero extends Juego {
    protected int numeroAAdivinar;
    protected static final Scanner TECLADO = new Scanner(System.in);
    protected Random azar = new Random();

    public JuegoAdivinaNumero(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    // Las subclases lo redefinen para generar un numero acorde al juego
    protected int generaNumero() {
        return azar.nextInt(11); // 0..10
    }

    public boolean validaNumero(int numero) {
        if (numero >= 0 && numero <= 10) {
            return true;
        }
        System.out.println("Error: el numero debe estar entre 0 y 10.");
        return false;
    }

    public void juega() {
        reiniciaPartida();
        numeroAAdivinar = generaNumero();
        System.out.println("Adivina un numero entre 0 y 10:");
        while (true) {
            int numero = TECLADO.nextInt();
            if (!validaNumero(numero)) {
                System.out.println("Intenta de nuevo:");
                continue; // numero invalido: no se pierde vida
            }
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
