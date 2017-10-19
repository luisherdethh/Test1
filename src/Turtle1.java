public class Turtle1 {
    static Turtle t = new Turtle(500, 500);
    public static void main(String[] args) {
        int costat = 40;
        int nchorz = 2;
        int ncvert = 3;

        for (int j = 0; j < ncvert; j++) {
            for (int i = 0; i < nchorz; i++) {
                liniaHoritzontal(costat);
            }
            baixaIcoloca(costat, nchorz);
        }
        t.show();
    }

    static void liniaHoritzontal(int costat) {
        quadrat(costat);
        t.turnRight(90);
        t.penDown = false;
        t.forward(costat + costat/2);
        t.penDown = true;
        t.turnLeft(90);
    }

    static void baixaIcoloca(int costat, int nchorz) {
        t.penDown = false;
        t.turnLeft(90);
        t.forward(nchorz * (costat + costat/2));
        t.turnLeft(90);
        t.forward(costat + costat/2);
        t.turnLeft(180);
        t.penDown = true;
    }

    public static void quadrat(int costat) {
        for (int i = 0; i < 4; i++) {
            t.forward(costat);
            t.turnRight(90);
        }
    }
}

