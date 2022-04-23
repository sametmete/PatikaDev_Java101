import java.util.Scanner;
public class GirilenSayiyaKadarKuvvetleriBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int exponentOfNumber;
        System.out.print("Sayı giriniz : ");
        exponentOfNumber = scan.nextInt();

        for (int i=1; i<=exponentOfNumber; i*=4){

            System.out.println(i);

            }
        System.out.println("---------------------");
        for (int j=1; j<=exponentOfNumber; j*=5){
            System.out.println(+j);

        }


    }
}
