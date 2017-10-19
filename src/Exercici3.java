import java.util.Scanner;

public class Exercici3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Escribe un número");
        int num = s.nextInt();
        for (int i = 0; i < num; i++) {
            System.out.println((i*2));
        }
    }
}
