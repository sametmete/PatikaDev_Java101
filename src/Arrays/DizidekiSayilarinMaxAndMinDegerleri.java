package Arrays;
import java.util.Scanner;
public class DizidekiSayilarinMaxAndMinDegerleri {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] arr = {34, 105, 3, 44, 59, 77, 1, 92, 6, 11};
        System.out.print("Dizi : { ");
        for (int tempArray : arr){;
            System.out.print(tempArray+" ");
        }
        System.out.print("}");
        int min = 0, max = 0, number;
        System.out.print("\nBir sayi giriniz : ");
        number = scan.nextInt();

        int bigNear = 0, counter1 = 0, counter2 = 0, smallNear = 0;

        for (int i = 0; i < arr.length; i++) {
            if (number > arr[i]) {
                counter1++;
                int temp = number - arr[i];
                if (counter1 < 2) {
                    min = temp;
                }
                if (temp <= min) {
                    min = temp;
                    smallNear = arr[i];
                }
            }
            if (number < arr[i]) {
                counter2++;
                int bigTemp = number - arr[i];
                if (counter2 < 2) {
                    max = bigTemp;
                }
                if (bigTemp >= max) {
                    max = bigTemp;
                    bigNear = arr[i];
                }
            }
        }
        System.out.println("Girilen sayidan kucuk en yakin sayi : " + smallNear);
        System.out.println("Girilen sayidan buyuk en yakin sayi : " + bigNear);


    }
}
