package Arrays;

import java.util.Random;

public class ArrayExample2 {
    public static void main(String[] args) {

        //Ýstenilen boyutta matris olusturularak matris degerlerine
        // 0-99 arasi random sayilar ureterek matrise atama yapan uygulama.

        Random rnd = new Random();

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int number = rnd.nextInt(99);
                matrix[i][j] = number;
            }
        }

        for (int i=0;i< matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                //System.out.print("  "+matrix[i][j]);
            }
            //System.out.println();
        }

        for (int[] i: matrix) {
            for (int j : i){
                System.out.print(j+" ");
            }
            System.out.println();
        }


    }
}
