import java.util.Scanner;

public class RecursiveUsAlma {

    static int result=1;
    public static int power(int exp, int base) {

        if (exp == 0)
            return 1;
        result *= base;
        power(exp-1,base);
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int exponent, base;

        System.out.print("Taban degeri giriniz : ");
        base = scan.nextInt();

        System.out.print("Us degerini giriniz : ");
        exponent = scan.nextInt();

        System.out.println("Sonuc : "+power(exponent,base));



    }
}
