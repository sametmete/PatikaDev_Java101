import java.util.Scanner;
public class HipotenusBulanProgram {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int aKenar,bKenar,hipotenus;

        System.out.print("Üçgenin 1. kenarının uzunluğunu giriniz : ");
        aKenar = scan.nextInt();

        System.out.print("Üçgenin 2. kenarının uzunluğunu giriniz : ");
        bKenar = scan.nextInt();

        hipotenus = (aKenar*aKenar)+(bKenar*bKenar);

        System.out.println("Kenar uzunluklarını girmiş olduğunuz üçgenin hipotenüsü : "+hipotenus);

    }
}
