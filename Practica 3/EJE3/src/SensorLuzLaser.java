public class SensorLuzLaser extends Sensor implements LuzLaser {
    public static String tipo = "Luz Laser";  // atributo de clase
    protected int alcance;                    // atributo de instancia

    public SensorLuzLaser(String id, int alcance) {
        super(id);
        this.alcance = alcance;
    }

    @Override
    public int getAlcance() {
        return alcance;
    }

    @Override
    public void escanear() {
        if (!encendido) {
            System.out.println("[" + id + "] no se puede escanear: sensor apagado");
        } else {
            System.out.println("[" + id + "] escaneando hasta " + alcance + " m");
        }
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", alcance=" + alcance + " m";
    }
}
