public class MiPunto {
    private double x;
    private double y;
    public MiPunto (){
        this.x=0;
        this.y=0;

    }
    public MiPunto (double x , double y){
        this.x=x;
        this.y=y;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double distancia (MiPunto punto){
        punto.getX();
        punto.getY();
        return Math.sqrt(
                Math.pow(punto.getX() - this.x , 2) +
                Math.pow(punto.getY() - this.y, 2 )
        );
    }

    public double distancia (double x , double y){
        return Math.sqrt(
                Math.pow( x - this.x , 2) +
                Math.pow( y - this.y, 2 )
        );
    }
}
