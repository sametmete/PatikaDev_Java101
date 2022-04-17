import java.util.Scanner;
public class VucutKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double vucutKitleEndeksi,kilo,boy;


        System.out.print("Lütfen boyunuzu (virgül kullanarak) giriniz : ");
        boy = scan.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = scan.nextDouble();

        vucutKitleEndeksi = kilo/(boy*boy);

        System.out.println(String.format("Vücut kitle endeksiniz : %.1f",vucutKitleEndeksi));

        if (vucutKitleEndeksi>18.5 && vucutKitleEndeksi<24.99)
        {
            System.out.println("Çıkan vücut kitle endeks değerinize göre normal kilo kategorisinde yer almaktasınız.");
        }
        else if (vucutKitleEndeksi>25 && vucutKitleEndeksi<30)
        {
            System.out.println("Çıkan vücut kitle endeks değerinize göre fazla kilolu kategorisinde yer almaktasınız.");
        } else if (vucutKitleEndeksi>30)
        {
            System.out.println("Çıkan vücut kitle endeks değerinize göre obezite kategorisinde yer almaktasınız.");
        }
    }
}
