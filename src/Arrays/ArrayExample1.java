package Arrays;

import java.util.Scanner;

public class ArrayExample1 {
    public static void main(String[] args) {

        //Matris boyutunu gelistiricinin belirledigi matris degerlerini ise kullanicinin girdigi uygulama.

        Scanner scan = new Scanner(System.in);
        String[][] cities = new String[2][3];
        System.out.println("Once 3 adet ili sonrasinda o illere ait plaka kodunu giriniz : ");

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[0].length; j++) {
                System.out.print((j+1)+". degeri giriniz :");
               cities[i][j] = scan.nextLine();
            }
            if (i<1) {
                System.out.println("Simdi plakalari giriniz ");
            }
        }

        System.out.println("Girdiginiz degerler :");

        for (int row = 0; row < cities.length; row++) {
            for (int column = 0; column < cities[0].length; column++) {
                System.out.print(cities[row][column] + "  ");
            }
            System.out.println();
        }

    }
}
