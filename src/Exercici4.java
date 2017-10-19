import java.util.Scanner;

public class Exercici4 {
    public static void main(String[] args) {
        Scanner tabla = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num = tabla.nextInt();
        System.out.println("La tabla del " + num);

        for (int i = 1; i < 12; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
