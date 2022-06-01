import java.util.Scanner;

public class RecursivePrimeNumber {

    public static boolean primeNumber(int number, int tempNumber) {

        if(number <= 2){
            return (number == 2) ? true : false;
        }
        if(number == tempNumber){
            return true;
        }

        if(number % tempNumber == 0){
            return false;
        }

        return primeNumber(number,tempNumber+1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, tempNumber;
        System.out.print("Sayi giriniz : ");
        number = scan.nextInt();

        if(primeNumber(number,2)) {
            System.out.println(number + " sayisi asaldir.");

        } else {
            System.out.println(number + " sayisi asal degildir.");
        }
    }
}
