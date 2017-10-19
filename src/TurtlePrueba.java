public class TurtlePrueba {
    static Turtle t = new Turtle(800, 800);

    public static void main(String[] args) {
        int lados = 30;
        int numhor = 5;
        int numver = 3;

        for (int i = 0; i < numhor; i++) {
            for (int j = 0; j < numhor; j++) {
                espaciobajo(lados, numver);
//            }
            lineahorizontal(lados);

        }
        t.show();
    }

    static void lineahorizontal(int lados) {
        cuadrado(lados);
        t.turnRight(90);
        t.penDown = false;
        t.forward(lados + (lados/2));
        t.penDown = true;
        t.turnLeft(90);
    }

    static void espaciobajo (int lados, int numver){
        t.penDown = false;
        t.turnLeft(90);
        t.forward(numver * (lados + lados/2));
        t.turnLeft(90);
        t.forward(lados + lados/2);
        t.turnLeft(180);
        t.penDown = true;
    }

    public static void cuadrado(int lados) {
        for (int i = 0; i < 4; i++) {
            t.forward(lados);
            t.turnRight(90);
        }
    }
}
