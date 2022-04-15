import java.util.Scanner;
public class Taksimetre_Programi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int taksimetreAcilis=10;
        double taksimetreTutar,gidilenYolMesafesi,taksimetreKM=2.20;

        System.out.print("Taksi ile gidilen mesafeyi km cinsinden giriniz : ");
        gidilenYolMesafesi = scan.nextInt();

        taksimetreTutar = ((gidilenYolMesafesi*taksimetreKM)+taksimetreAcilis);

        taksimetreTutar = taksimetreTutar<20 ? taksimetreTutar=20 : taksimetreTutar;

        System.out.println("Ödenecek taksi ücreti : "+taksimetreTutar+" TL");

    }
}
