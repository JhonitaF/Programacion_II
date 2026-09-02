import java.util.Random;
public class PruebaCronometro {
    public static void main(String[] args) {
        int[] numeros = new int[100000];
        Random numerosAleatorios = new Random();
        for (int i = 0 ;  i < numeros.length ; i++){
            numeros[i] = numerosAleatorios.nextInt(100000);
        }
        Cronometro miCrono = new Cronometro();
        miCrono.inicia();
        System.out.println("Iniciando Cronometro");
        for (int i = 0 ; i < numeros.length ; i++){
            int menor = i;
            for (int j = i + 1 ; j < numeros.length ; j++ ){
                if (numeros [j] < numeros[menor]){
                    menor = j;
                }
            }
            int aux = numeros[i];
            numeros[i] = numeros[menor];
            numeros[menor] = aux;
        }
        miCrono.detener();
        System.out.println("Deteniendo Cronometro");
        miCrono.lapsoDeTiempo();
        System.out.println("El tiempo fue de "+miCrono.lapsoDeTiempo()+"ms");
    }
}



