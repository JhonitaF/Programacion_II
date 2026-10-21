public class Sensor {
    public static String tipo = "Genérico";   // atributo de clase
    protected String id;                      // atributo de instancia
    protected boolean encendido;              // atributo de instancia

    public Sensor(String id) {
        this.id = id;
        this.encendido = false;
    }

    public void activar() {
        encendido = true;
        System.out.println("[" + getTipo() + " " + id + "] activado");
    }

    public void desactivar() {
        encendido = false;
        System.out.println("[" + getTipo() + " " + id + "] desactivado");
    }

    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return getTipo() + " (id=" + id + ", encendido=" + encendido + ")";
    }
}
