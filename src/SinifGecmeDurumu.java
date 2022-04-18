import java.util.Scanner;
public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mat,turkce,kimya,fizik,muzik,ortalama;
        int sayac = 0,toplam = 0;

        System.out.print("Matematik notunuzu giriniz : ");
        mat = scan.nextDouble();
            if(mat>=0 && mat<=100){
                toplam += mat;
                sayac++;
            }

        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = scan.nextDouble();
            if(turkce>=0 && turkce<=100){
                toplam += turkce;
                sayac++;
            }

        System.out.print("Kimya notunuzu giriniz : ");
        kimya = scan.nextDouble();
            if(kimya>=0 && kimya<=100){
                toplam += kimya;
                sayac++;
            }

        System.out.print("Fizik notunuzu giriniz : ");
        fizik = scan.nextDouble();
            if(fizik>=0 && fizik<=100){
                toplam += fizik;
                sayac++;
            }

        System.out.print("Müzik notunuzu giriniz : ");
        muzik = scan.nextDouble();
        if(muzik>=0 && muzik<=100){
            toplam += muzik;
            sayac++;
        }

        ortalama = toplam/sayac;

        if(ortalama<=55){
            System.out.println("Sınıfta kaldınız!");

        }
        else {
            System.out.println("Tebrikler sınıfı geçtiniz!");
        }
        System.out.println("Ortalamanız : "+ortalama);

    }
}
