public class Estadistica {
    private double [] valores;
    public Estadistica(double[] valores) {
        this.valores = valores;
    }
    public double promedio(){
        double suma = 0;
        for (int i = 0 ; i < valores.length; i++ ){
            suma = suma + valores[i];
        }
        return suma / valores.length;
    }
    public double desviacion(){
        double suma = 0;
        double promedio = promedio();
        for (int i = 0; i < valores.length; i++){
             suma = suma + Math.pow(valores[i]-promedio(), 2);
        }
        return Math.sqrt(suma / (valores.length -1 ));
    }
}




