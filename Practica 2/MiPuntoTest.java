public class MiPuntoTest {
        public static void main(String[] args){

            MiPunto p1 = new MiPunto(3,4);
            MiPunto p2 = new MiPunto(6,8);
            System.out.println(
                    "La distancia es: " + p1.distancia(p2));
            System.out.println(
                    "La distancia es: " + p1.distancia(6, 8));

        }

}
