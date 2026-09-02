import java.util.Scanner;

public class PruebaEstadistica {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double [] valores = new double[10];
        for (int i=0; i< valores.length;i++){
            valores[i] = entrada.nextDouble();
        }
        Estadistica estadistica = new Estadistica(valores);
        System.out.println("El promedio es: "+estadistica.promedio());
        System.out.println("La desviacion es: "+estadistica.desviacion());

    }

}




