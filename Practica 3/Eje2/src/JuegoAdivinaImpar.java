public class JuegoAdivinaImpar extends JuegoAdivinaNumero {

    public JuegoAdivinaImpar(int numeroDeVidas) {
        super(numeroDeVidas);
    }

    @Override
    protected int generaNumero() {
        return azar.nextInt(5) * 2 + 1; // 1,3,5,7,9
    }

    @Override
    public boolean validaNumero(int numero) {
        if (numero % 2 == 0) {
            System.out.println("Error: debes ingresar un numero IMPAR.");
            return false;
        }
        return super.validaNumero(numero); // verifica el rango 0..10
    }
}
