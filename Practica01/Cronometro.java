public class Cronometro {
    private long inicia , finaliza ;
    public Cronometro() {
        this.inicia = System.currentTimeMillis();
    }
    public long getInicia() {
        return inicia;
    }
    public long getFinaliza() {
        return finaliza;
    }
    public void inicia (){
        this.inicia = System.currentTimeMillis();
    }
    public void detener (){
        this.finaliza = System.currentTimeMillis();
    }
    public long lapsoDeTiempo () {
        return this.finaliza - this.inicia;
    }
}

