import java.util.Scanner;
public class EstadisticaFM {
    public static double promedio(double[] valores) {
        double suma = 0;
        for (int i = 0; i < valores.length; i++) {
            suma += valores[i];
        }
        return suma / valores.length;
    }
    public static double desviacion(double[] valores) {
        double suma = 0;
        double promedio = promedio(valores);
        for (int i = 0; i < valores.length; i++) {
            suma += Math.pow(valores[i] - promedio, 2);
        }
        return Math.sqrt(suma / (valores.length - 1));
    }
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] valores = new double[10];
        for (int i = 0; i < valores.length; i++) {
            valores[i] = entrada.nextDouble();
        }
        System.out.println("El promedio es: " + promedio(valores));
        System.out.println("La desviacion es: " + desviacion(valores));
    }
}


