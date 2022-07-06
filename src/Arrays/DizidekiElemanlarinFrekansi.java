package Arrays;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int[] arr = {10, 10, 2, 10, 5, 4, 20, 20, 2, 20, 20};

        Arrays.sort(arr);
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    counter++;
                }
            }
            if (i == 0 && arr[i + 1] == arr[i]) {
                System.out.println(arr[i] + " sayisi " + counter + " kere tekrar etti.");
            }

            if (i == 0 && arr[i + 1] != arr[i]) {
                System.out.println(arr[i] + " sayisi " + counter + " kere tekrar etti.");
            }

            if (i != 0 && arr[i - 1] != arr[i]){
                System.out.println(arr[i] + " sayisi " + counter + " kere tekrar etti.");
            }

        }

    }
}
