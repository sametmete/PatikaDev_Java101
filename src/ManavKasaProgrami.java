import java.util.Scanner;
public class ManavKasaProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double alinanArmut,alinanElma,alinanDomates,alinanMuz,alinanPatlican;
        double armutFiyat=2.14,elmaFiyat=3.67,domatesFiyat=1.11,muzFiyat=0.95,patlicanFiyat=5.00;

        System.out.print("Armut kaç kilo ? : ");
        alinanArmut = scan.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        alinanElma = scan.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        alinanDomates = scan.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        alinanMuz = scan.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        alinanPatlican = scan.nextDouble();

        double toplamTutar = (alinanArmut*armutFiyat)+(alinanDomates*domatesFiyat)+(alinanElma*elmaFiyat)+(alinanMuz*muzFiyat)+(alinanPatlican*patlicanFiyat);

        System.out.println(String.format("Ödemeniz gereken toplam tutar : %.2f TL \nBizi tercih ettiğiniz için teşekkür ederiz.",toplamTutar));
    }
}
