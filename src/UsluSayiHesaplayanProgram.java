import java.util.Scanner;
public class ÜslüSayiHesaplayanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi,üssü,toplam=1;
        System.out.print("Sayı giriniz : ");
        sayi = scan.nextInt();

        System.out.print("Üssünü giriniz : ");
        üssü = scan.nextInt();

        for (int i=1; i<=üssü; i++){
            toplam *= sayi;
        }
        System.out.println(sayi+" üzeri "+üssü+" = "+toplam);
    }
}
