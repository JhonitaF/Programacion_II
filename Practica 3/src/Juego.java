public class Juego {
    protected int numeroDeVidas;
    protected int record;
    private int vidasIniciales;

    public Juego(int numeroDeVidas) {
        this.numeroDeVidas = numeroDeVidas;
        this.vidasIniciales = numeroDeVidas;
        this.record = 0;
    }

    public void reiniciaPartida() {
        numeroDeVidas = vidasIniciales;
    }

    public void actualizaRecord() {
        if (numeroDeVidas > record) {
            record = numeroDeVidas;
            System.out.println("Nuevo record: " + record + " vida(s) restantes.");
        }
    }

    // Devuelve true si aun le quedan vidas al jugador
    public boolean quitaVida() {
        numeroDeVidas--;
        if (numeroDeVidas > 0) {
            System.out.println("Te quedan " + numeroDeVidas + " vida(s).");
            return true;
        }
        System.out.println("Te quedaste sin vidas.");
        return false;
    }
}

