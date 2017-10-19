import java.util.Scanner;

public class Exercici2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce Grados Celsius");
        int celsius = s.nextInt();
        //int celsius = 30;
        float Fahrenheit = (1.8f * celsius) + 32;
        System.out.println(+celsius+ " Celsius son " +Fahrenheit+ " Grados en Farenheit");
    }
}
