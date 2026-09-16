public class AlgebraVectorial {
    private double x;
    private double y;
    private double z;

    // Constructores (Sobrecarga)
    public AlgebraVectorial() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public AlgebraVectorial(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Getters
    public double getX() { return x; }
    public double getY() { return y; }
    public double getZ() { return z; }

    // Métodos auxiliares de operaciones con vectores
    public double modulo() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double moduloCuadrado() {
        return x * x + y * y + z * z;
    }

    public AlgebraVectorial suma(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x + v.x, this.y + v.y, this.z + v.z);
    }

    public AlgebraVectorial resta(AlgebraVectorial v) {
        return new AlgebraVectorial(this.x - v.x, this.y - v.y, this.z - v.z);
    }

    public double productoEscalar(AlgebraVectorial v) {
        return this.x * v.x + this.y * v.y + this.z * v.z;
    }

    public AlgebraVectorial productoCruz(AlgebraVectorial v) {
        double cx = this.y * v.z - this.z * v.y;
        double cy = this.z * v.x - this.x * v.z;
        double cz = this.x * v.y - this.y * v.x;
        return new AlgebraVectorial(cx, cy, cz);
    }

    public AlgebraVectorial multiplicarEscalar(double r) {
        return new AlgebraVectorial(this.x * r, this.y * r, this.z * r);
    }

    // a) Perpendicular: |a + b| = |a - b|
    public boolean esPerpendicular(AlgebraVectorial a, AlgebraVectorial b) {
        double absSuma = a.suma(b).modulo();
        double absResta = a.resta(b).modulo();
        return Math.abs(absSuma - absResta) < 1e-6;
    }

    // b) Perpendicular: |a - b| = |b - a|
    public boolean esPerpendicular(AlgebraVectorial a, AlgebraVectorial b, int dummy) {
        double absResta1 = a.resta(b).modulo();
        double absResta2 = b.resta(a).modulo();
        return Math.abs(absResta1 - absResta2) < 1e-6;
    }

    // c) Perpendicular: a . b = 0
    public boolean esPerpendicular(AlgebraVectorial a, AlgebraVectorial b, double dummy) {
        return Math.abs(a.productoEscalar(b)) < 1e-6;
    }

    // d) Perpendicular: |a + b|^2 = |a|^2 + |b|^2
    public boolean esPerpendicular(AlgebraVectorial a, AlgebraVectorial b, String dummy) {
        double lhs = a.suma(b).moduloCuadrado();
        double rhs = a.moduloCuadrado() + b.moduloCuadrado();
        return Math.abs(lhs - rhs) < 1e-6;
    }

    // e) Paralela: a = r * b (comprueba si existe una constante r)
    public boolean esParalela(AlgebraVectorial a, AlgebraVectorial b) {
        Double r = null;
        double[] compA = {a.x, a.y, a.z};
        double[] compB = {b.x, b.y, b.z};

        for (int i = 0; i < 3; i++) {
            if (compB[i] != 0) {
                double ratio = compA[i] / compB[i];
                if (r == null) {
                    r = ratio;
                } else if (Math.abs(r - ratio) > 1e-6) {
                    return false;
                }
            } else if (compA[i] != 0) {
                return false;
            }
        }
        return true;
    }

    // f) Paralela: a x b = 0
    public boolean esParalela(AlgebraVectorial a, AlgebraVectorial b, int dummy) {
        return a.productoCruz(b).modulo() < 1e-6;
    }

    // g) Proyeccion de a sobre b: Proy_b(a) = ((a . b) / |b|^2) * b
    public AlgebraVectorial proyeccion(AlgebraVectorial a, AlgebraVectorial b) {
        double escalar = a.productoEscalar(b) / b.moduloCuadrado();
        return b.multiplicarEscalar(escalar);
    }

    // h) Componente de a en b: Comp_b(a) = (a . b) / |b|
    public double componente(AlgebraVectorial a, AlgebraVectorial b) {
        return a.productoEscalar(b) / b.modulo();
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f, %.2f)", x, y, z);
    }
}