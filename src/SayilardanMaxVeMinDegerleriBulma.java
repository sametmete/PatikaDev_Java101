import java.util.Scanner;
public class SayilardanMaxVeMinDegerleriBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,max=0,min;

        System.out.print("Kaç tane sayý gireceksiniz : ");
        int enteredNumber = scan.nextInt();

        System.out.print("1.sayýyý giriniz : ");
        number = scan.nextInt();
        min = number;
        int i=2;
        while(i<=enteredNumber){
            System.out.print(i+" .sayýyý giriniz : ");
            number = scan.nextInt();


            if (number>max){
                max = number;
            }

            if(min>number){
                min = number;
            }

            i++;
        }
        System.out.println("Maksimum : "+max);
        System.out.println("Minimum : "+min);
    }
}
