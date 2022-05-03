import java.util.Scanner;
public class HarmonikSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double result=0.0;
        int number;

        System.out.print("Sayý giriniz : ");
        number = scan.nextInt();

        for (double i=1; i<=number; i++){
            result += (1/i);
        }
        System.out.println(result);


    }
}
