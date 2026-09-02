import java.util.Scanner;

public class PruebaEcuacionCuadratica {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();

        EcuacionCuadratica ecuacionCuadratica = new EcuacionCuadratica(a,b,c);
        if ( ecuacionCuadratica.getDiscriminante() > 0){
            System.out.println("La ecuacion tiene dos raices " + ecuacionCuadratica.getRaiz1() + "y " + ecuacionCuadratica.getRaiz2());
        } else if (ecuacionCuadratica.getDiscriminante() == 0) {
            System.out.println("La ecuacion solo tiene una solucion" + ecuacionCuadratica.getRaiz1());
        } else{
            System.out.println("La ecuacion no tiene raices reales");
        }
    }
}



