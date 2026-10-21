public class Camara extends Sensor {
    public static String tipo = "Cámara";     // atributo de clase
    protected String resolucion;              // atributo de instancia

    public Camara(String id, String resolucion) {
        super(id);
        this.resolucion = resolucion;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", resolucion=" + resolucion;
    }
}
