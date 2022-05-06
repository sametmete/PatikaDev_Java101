import java.util.Scanner;
public class MukemmelSayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number=0,result=0;
        boolean isError = false;

        System.out.print("Say� giriniz : ");

        if (scan.hasNextInt()) {
            number = scan.nextInt();
            if (number>0) {
                for (int i = 1; i <= number; i++) {
                    if (number % i == 0 && number != i) {
                        result += i;
                    }
                }
            }else {
                isError = true;
            }
        }else {
            isError = true;
        }
        if (isError){
            System.out.println("Hatal� bir de�er girdiniz!");
        }else {
            if (number == result) {
                System.out.println(number + " M�kemmel say�d�r.");
            } else {
                System.out.println(number + " M�kemmel say� de�ildir.");
            }
        }

    }
}
