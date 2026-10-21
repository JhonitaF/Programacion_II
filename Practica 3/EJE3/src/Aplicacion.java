public class Aplicacion {
    public static void main(String[] args) {
        Sensor sensor = new Sensor("S-01");
        Camara camara = new Camara("C-01", "1920x1080");
        SensorLuzLaser laser = new SensorLuzLaser("L-01", 120);
        VehiculoAutonomo vehiculo = new VehiculoAutonomo("V-01", "4K", 200);

        System.out.println("=== Objetos creados ===");
        System.out.println(sensor);
        System.out.println(camara);
        System.out.println(laser);
        System.out.println(vehiculo);

        System.out.println();
        System.out.println("=== Activando sensores ===");
        sensor.activar();
        camara.activar();
        laser.activar();
        vehiculo.activar();

        System.out.println();
        System.out.println("=== Escaneo laser ===");
        laser.escanear();
        vehiculo.escanear();

        System.out.println();
        System.out.println("=== Polimorfismo ===");
        Sensor s = vehiculo; // un VehiculoAutonomo ES un Sensor
        System.out.println("Tipo (via referencia Sensor): " + s.getTipo());
        System.out.println(s);

        System.out.println();
        System.out.println("=== Atributos de clase (tipo) ===");
        System.out.println("Sensor.tipo            = " + Sensor.tipo);
        System.out.println("Camara.tipo            = " + Camara.tipo);
        System.out.println("SensorLuzLaser.tipo    = " + SensorLuzLaser.tipo);
        System.out.println("VehiculoAutonomo.tipo  = " + VehiculoAutonomo.tipo);

        System.out.println();
        vehiculo.desactivar();
        System.out.println(vehiculo);
    }
}
