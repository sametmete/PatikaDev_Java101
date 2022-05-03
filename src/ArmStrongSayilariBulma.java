import java.util.Scanner;
public class ArmStrongSayilariBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number, result = 0, tempNumber, basPow, basValue;

        //Girilen sayının rakamlarını toplayan ders sonu ödevi.
        System.out.print("Sayı giriniz : ");
        number = scan.nextInt();

            tempNumber = number;

        while(tempNumber !=0 ){
            result += (tempNumber %10);
            tempNumber /= 10;

        }
        System.out.println("Girilen sayının rakamları toplamı : "+result);

        /*

        //3 Basamaklı sayılar arasında armStrong sayıları bulup ekrana yazdıran ders sonu hocanın yapmayı önerdiği ödev
        for (int i = 100; i <= 999; i++) {

            number = i;
            tempNumber = i;

            while (tempNumber != 0) {
                basValue = tempNumber % 10;
                basPow = 1;
                for (int j = 1; j <= 3; j++) {
                    basPow *= basValue;
                }
                result += basPow;
                tempNumber /= 10;

            }

            if (result == number) {
                System.out.println(number + " sayısı bir Armstrong sayıdır.");

            }
            result = 0;
*/


        }
    }

