import java.util.Scanner;
public class HavaSicaklikOneriProgrami {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sicaklik;
        System.out.println("Sıcaklık derecesini giriniz : ");
        sicaklik = scan.nextInt();

        if(sicaklik<5){
            System.out.print("Hava sıcaklığı kayak yapmak için uygun.");

        }
        else if (sicaklik>5 && sicaklik<25) {

                if (sicaklik<=15){
                    System.out.println("Sinemaya gidebilirsin.");
            }
                if (sicaklik>=10) {
                    System.out.print("Pikniğe gidebilirsin");
                }

        }
        else {
            System.out.print("Denize gidebilirsin");
        }
    }
}
