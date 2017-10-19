public class Ejemplo {
    public static void main(String[] args) {
        //números primeros, se debe dividir por el mismo 17
        int n = 2;
        boolean primer;
        while (n <= 100){
            primer = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0){
                    //System.out.println("No primer");
                    primer = false;
                    break; //rompe el for y no sigue
                }
            }
            if (primer == true){
                System.out.println("El número " + n + " és impar");
            }
            n++;
        }
    }
}
