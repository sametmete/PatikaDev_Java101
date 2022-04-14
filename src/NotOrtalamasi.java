import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {

        Scanner ipt = new Scanner(System.in);

        System.out.println("Matematik dersi notunuzu giriniz : ");
        int mat = ipt.nextInt();

        System.out.println("Türkçe ders notunuzu giriniz : ");
        int turkce = ipt.nextInt();

        System.out.println("Fizik ders notunuzu giriniz : ");
        int fizik = ipt.nextInt();

        System.out.println("Kimya ders notunuzu giriniz : ");
        int kimya = ipt.nextInt();

        System.out.println("Tarih ders notunuzu giriniz : ");
        int tarih = ipt.nextInt();

        System.out.println("Müzik ders notunuzu giriniz : ");
        int muzik = ipt.nextInt();

        double notSonuc = (mat+turkce+fizik+kimya+tarih+muzik)/6;

        System.out.println("Tüm derslerin ortalaması : "+notSonuc);

        String dersDurum = notSonuc>60 ? "Sınıfı geçti":"Sınıfta kaldı";
        System.out.println("Sınıf geçme durumu : "+dersDurum);
    }
}
