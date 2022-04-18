import java.util.Scanner;

public class HesapMakinesiUygulamasi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number1, number2, sonuc, secim;

        System.out.print("İlk sayıyı giriniz : ");
        number1 = scan.nextInt();
        System.out.print("ikinci sayıyı giriniz : ");
        number2 = scan.nextInt();

        System.out.print("bToplama 1\nÇıkarma 2\nÇarpma 3\nBölme 4\nYapmak istediğiniz işlemi seçiniz :");
        secim = scan.nextInt();

        switch (secim) {
            case 1:
                System.out.println("Toplam : " + (number1 + number2));
                break;
            case 2:
                System.out.println("Fark : "+(number1-number2));
                break;
            case 3:
                System.out.println("Çarpım : "+(number1*number2));
                break;
            case 4:
                if(number2 != 0) {
                    System.out.println("Bölüm : " + (number1 / number2));
                }
                else {
                    System.out.println("Bölen sayı 0'a eşit olamaz!");
                }
                break;
            default:
                System.out.println("Geçersiz bir değer girdiniz!");
        }
    }
}
