import java.util.Scanner;
public class KDVHesaplamaProgrami {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double kdvTutari,kdvliToplamTutar;

        System.out.println("Tutar giriniz : ");
        double girilenTutar = scan.nextDouble();

        if (girilenTutar<=1000 && girilenTutar>0)
        {
            kdvTutari = ((girilenTutar*18)/100);
            kdvliToplamTutar = girilenTutar+kdvTutari;
            System.out.println("Girilen Tutar : "+girilenTutar);
            System.out.println("KDV Tutarı : "+kdvTutari);
            System.out.println("KDV dahil toplam tutar : "+kdvliToplamTutar);
        }
        else if (girilenTutar>1000)
        {
            kdvTutari = ((girilenTutar*8)/100);
            kdvliToplamTutar = girilenTutar+kdvTutari;
            System.out.println("Girilen Tutar : "+girilenTutar);
            System.out.println("KDV Tutarı : "+kdvTutari);
            System.out.println("KDV dahil toplam tutar : "+kdvliToplamTutar);
        }

    }
}


