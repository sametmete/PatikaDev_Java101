import java.util.Scanner;
public class GirilenSayiyaKadarCiftSayilariBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,total=0,counter=0;
        double average;

        System.out.print("Sayı giriniz : ");
        number = scan.nextInt();
        //Girilen sayıya kadar çift sayıları gösterir. :
        /*
        for (int i=1; i <= number ;i++){
            if (i %2 == 0){
                System.out.println(i);
            }
        }
        */
//Girilen sayıya kadar olan sayılarda 3 ve 4'e bölünen sayıların ortalamasını gösterir. :
        for (int i=1; i <= number ;i++){
            if (i%3 == 0 && i%4 == 0){
                total += i;
                counter++;
            }
        }
        if (counter == 0){
            System.out.println("Girdiğiniz sayıya kadar olan sayılar içinde 3 ve 4'e tam bölünebilen bir sayı bulunamadı!");
        }
        average = total/counter;
        System.out.println("3 ve 4'e bölünen sayıların ortalaması : "+average);

    }


}
