import java.util.Scanner;
public class TekSayilarinToplaminiBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,total=0;

        do {
            System.out.print("Sayı giriniz : ");
            number = scan.nextInt();
            if (number%2 ==0  && number%4 == 0){
                total += number;
            }
        }while (number%2 == 0);

        System.out.println("Girilen sayılardan çift ve 4'ün katları olan sayıların toplamı : "+total);

    }
}
