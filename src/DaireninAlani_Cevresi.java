import java.util.Scanner;

public class DaireninAlani_Cevresi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double yariCap, merkezAci,alan,cevre,pi=3.14,daireDilimAlani;

        System.out.print("Dairenin yarıçapını giriniz : ");
        yariCap = scan.nextDouble();

        System.out.print("Dairenin merkez açısının ölçüsünü giriniz : ");
        merkezAci = scan.nextDouble();

        alan = pi*yariCap*yariCap;

        cevre = 2*pi*yariCap;

        daireDilimAlani = (pi*(yariCap*yariCap)*merkezAci)/360;

        System.out.println("Dairenin alanı : "+alan);
        System.out.println("Dairenin çevresi : "+cevre);
        System.out.println("Daire diliminin alanı : "+daireDilimAlani);


    }
}
