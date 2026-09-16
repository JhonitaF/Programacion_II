public class Vector3D {
    private double a1;
    private double a2;
    private double a3;

    // Constructores
    public Vector3D() {
        this.a1 = 0;
        this.a2 = 0;
        this.a3 = 0;
    }

    public Vector3D(double a1, double a2, double a3) {
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    // Getters
    public double getA1() { return a1; }
    public double getA2() { return a2; }
    public double getA3() { return a3; }

    // a) Suma de dos vectores: c = a + b = (a1 + b1, a2 + b2, a3 + b3)
    public Vector3D plus(Vector3D b) {
        return new Vector3D(this.a1 + b.a1, this.a2 + b.a2, this.a3 + b.a3);
    }

    // b) Multiplicación de un escalar r por un vector: b = r*a = (r*a1, r*a2, r*a3)
    public Vector3D multiply(double r) {
        return new Vector3D(r * this.a1, r * this.a2, r * this.a3);
    }

    // c) Longitud de un vector: |a| = sqrt(a1^2 + a2^2 + a3^2)
    public double longitud() {
        return Math.sqrt(a1 * a1 + a2 * a2 + a3 * a3);
    }

    // d) Normal de un vector: b = a / |a| = (a1/|a|, a2/|a|, a3/|a|)
    public Vector3D normal() {
        double mod = this.longitud();
        if (mod == 0) {
            throw new ArithmeticException("No se puede normalizar el vector nulo.");
        }
        return new Vector3D(this.a1 / mod, this.a2 / mod, this.a3 / mod);
    }

    // e) Producto escalar de a y b: a . b = a1*b1 + a2*b2 + a3*b3
    public double dot(Vector3D b) {
        return this.a1 * b.a1 + this.a2 * b.a2 + this.a3 * b.a3;
    }

    // f) Producto vectorial de a y b: a x b = (a2*b3 - a3*b2, a3*b1 - a1*b3, a1*b2 - a2*b1)
    public Vector3D cross(Vector3D b) {
        double c1 = this.a2 * b.a3 - this.a3 * b.a2;
        double c2 = this.a3 * b.a1 - this.a1 * b.a3;
        double c3 = this.a1 * b.a2 - this.a2 * b.a1;
        return new Vector3D(c1, c2, c3);
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", a1, a2, a3);
    }
}