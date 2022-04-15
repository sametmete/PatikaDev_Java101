import java.util.Scanner;
public class UcgenAlanHesabi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int kenar1,kenar2,kenar3;

        double alan,cevre,u;

        System.out.print("Üçgenin 1. kenar uzunluğunu giriniz : ");
        kenar1 = scan.nextInt();

        System.out.print("Üçgenin 2. kenar uzunluğunu giriniz : ");
        kenar2 = scan.nextInt();

        System.out.print("Üçgenin 3. kenar uzunluğunu giriniz : ");
        kenar3 = scan.nextInt();

        cevre = kenar1+kenar2+kenar3;

        u = cevre/2;

        alan = u*((u-kenar1)*(u-kenar2)*(u-kenar3));


        System.out.println("Üçgenin alanı : "+alan);
        System.out.println("Üçgenin çevresi : "+cevre);
    }
}
