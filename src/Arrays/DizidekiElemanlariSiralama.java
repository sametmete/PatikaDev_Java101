package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DizidekiElemanlariSiralama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutu n : ");
        int dimension = scan.nextInt();
        int[] arr = new int[dimension];

        System.out.println("Dizinin elemanlarini giriniz :");

        for (int i = 0; i < dimension; i++) {
            System.out.print((i+1) + ". Elemani : ");
            arr[i] = scan.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println("Siralama : "+Arrays.toString(arr));


    }
}
