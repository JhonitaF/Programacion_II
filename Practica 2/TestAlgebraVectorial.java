public class TestAlgebraVectorial {
    public static void main(String[] args) {
        // Instancia para invocar los métodos de prueba
        AlgebraVectorial av = new AlgebraVectorial();

        // 1. Pruebas de Vectores Perpendiculares (a = (1, 0, 0), b = (0, 1, 0))
        AlgebraVectorial vPerp1 = new AlgebraVectorial(1, 0, 0);
        AlgebraVectorial vPerp2 = new AlgebraVectorial(0, 1, 0);

        System.out.println("=== PRUEBAS DE PERPENDICULARIDAD ===");
        System.out.println("v1 = " + vPerp1 + ", v2 = " + vPerp2);
        System.out.println("a) |a + b| = |a - b| : " + av.esPerpendicular(vPerp1, vPerp2));
        System.out.println("b) |a - b| = |b - a| : " + av.esPerpendicular(vPerp1, vPerp2, 1));
        System.out.println("c) a . b = 0          : " + av.esPerpendicular(vPerp1, vPerp2, 0.0));
        System.out.println("d) |a+b|^2 = |a|^2+|b|^2: " + av.esPerpendicular(vPerp1, vPerp2, "d"));
        System.out.println();

        // 2. Pruebas de Vectores Paralelos (a = (2, 4, 6), b = (1, 2, 3))
        AlgebraVectorial vPar1 = new AlgebraVectorial(2, 4, 6);
        AlgebraVectorial vPar2 = new AlgebraVectorial(1, 2, 3);

        System.out.println("=== PRUEBAS DE PARALELISMO ===");
        System.out.println("v1 = " + vPar1 + ", v2 = " + vPar2);
        System.out.println("e) a = r * b (proporcionales) : " + av.esParalela(vPar1, vPar2));
        System.out.println("f) a x b = 0 (producto cruz)  : " + av.esParalela(vPar1, vPar2, 1));
        System.out.println();

        // 3 y 4. Pruebas de Proyección y Componente (a = (3, 4, 0), b = (2, 0, 0))
        AlgebraVectorial a = new AlgebraVectorial(3, 4, 0);
        AlgebraVectorial b = new AlgebraVectorial(2, 0, 0);

        System.out.println("=== PRUEBAS DE PROYECCIÓN Y COMPONENTE ===");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("g) Proyección de a sobre b : " + av.proyeccion(a, b));
        System.out.println("h) Componente de a en b   : " + av.componente(a, b));
    }
}