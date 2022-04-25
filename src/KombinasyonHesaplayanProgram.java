import java.util.Scanner;
public class KombinasyonHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number,i=1,j=1,total=1,total2=1,total3=1,number2=1,combination,difference;

        System.out.print("1. Faktoriyel sayısını giriniz : ");
        number = scan.nextInt();

        System.out.print("2. Faktoriyel sayısını giriniz : ");
        number2 = scan.nextInt();

        difference = number-number2;

        while(i<=number){
            total = total*i;
            i++;
        }

        while(j<=number2){
            total2 = total2*j;
            j++;
        }
        for (int k=1; k<=difference; k++){
            total3 = total3*k;
        }
        combination = total/(total2*(total3));

        System.out.println("Girilen sayıların kombinasyonu : "+combination);
    }
}
