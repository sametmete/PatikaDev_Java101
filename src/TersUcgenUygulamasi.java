import java.util.Scanner;
public class TersUcgenUygulamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir sayý giriniz : ");
        int number = scan.nextInt();

        for (int i = number; i >= 0; i--) {

            for (int j = 0; j <= (number - i + 1); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k < (2 * i ); k++) {
                System.out.print("*");
            }
            System.out.println(" ");


        }
    }
}
