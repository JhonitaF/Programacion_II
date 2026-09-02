import java.util.Scanner;
public class PruebaEcuacionLineal {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        double f = entrada.nextDouble();
        EcuacionLineal ecuacionLineal = new EcuacionLineal(a,b,c,d,e,f);
        if (ecuacionLineal.tieneSolucion()){
            System.out.println("X vale" + ecuacionLineal.getX());
            System.out.println("Y vale" + ecuacionLineal.getY());
        }else{
            System.out.println("No tiene solucion ");
        }
    }
}




