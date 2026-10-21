public class VehiculoAutonomo extends Camara implements LuzLaser {
    public static String tipo = "Vehículo Autónomo"; // atributo de clase
    private SensorLuzLaser laser;  // parte "SensorLuzLaser" del vehiculo (delegacion)

    public VehiculoAutonomo(String id, String resolucion, int alcance) {
        super(id, resolucion);
        this.laser = new SensorLuzLaser(id + "-LASER", alcance);
    }

    @Override
    public void activar() {
        super.activar();
        laser.activar();
    }

    @Override
    public void desactivar() {
        super.desactivar();
        laser.desactivar();
    }

    @Override
    public int getAlcance() {
        return laser.getAlcance();
    }

    @Override
    public void escanear() {
        laser.escanear();
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return super.toString() + ", alcance=" + getAlcance() + " m";
    }
}