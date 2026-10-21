public class JuegoAdivinaPar extends JuegoAdivinaNumero {

    public JuegoAdivinaPar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    protected int generaNumero() {
        return azar.nextInt(6) * 2; // 0,2,4,6,8,10
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 != 0) {
            System.out.println("Error: debes ingresar un numero PAR.");
            return false;
        }
        return super.validaNumero(numero); // verifica el rango 0..10
    }
}
