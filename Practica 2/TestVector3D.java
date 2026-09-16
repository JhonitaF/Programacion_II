public class TestVector3D {
    public static void main(String[] args) {
        Vector3D a = new Vector3D(2, 3, 4);
        Vector3D b = new Vector3D(1, 0, -2);
        double r = 2.5;

        System.out.println("Vector a: " + a);
        System.out.println("Vector b: " + b);
        System.out.println("Escalar r: " + r);
        System.out.println();

        // a) Suma
        System.out.println("a) Suma (a + b): " + a.plus(b));

        // b) Multiplicación por escalar
        System.out.println("b) Escalar * Vector (r * a): " + a.multiply(r));

        // c) Longitud
        System.out.println("c) Longitud de a |a|: " + a.longitud());

        // d) Normal
        System.out.println("d) Vector Normal de a: " + a.normal());

        // e) Producto Escalar
        System.out.println("e) Producto Escalar (a . b): " + a.dot(b));

        // f) Producto Vectorial
        System.out.println("f) Producto Vectorial (a x b): " + a.cross(b));
    }
}