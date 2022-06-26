package Arrays;

import java.util.Arrays;

public class DizideTekrarEdenCiftSayilariBulma {
    public static void main(String[] args) {
        int[] numbers = {12, 5, 22, 31, 5, 98, 12, 22, 54, 77, 31, 12, 22, 43, 54};
        int[] equalNumbers = new int[numbers.length];
        int counter = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j && numbers[i] == numbers[j]) {
                    if (numbers[i] % 2 == 0) {
                            equalNumbers[counter++] = numbers[i];
                            break;
                    }
                }
            }
        }


        System.out.println(Arrays.toString(equalNumbers));
    }
}
