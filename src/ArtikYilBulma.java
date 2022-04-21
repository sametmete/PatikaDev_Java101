import java.util.Scanner;
public class ArtikYilBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Yıl giriniz : ");
        int year;
        if (scan.hasNextInt()){
            year = scan.nextInt();
            if (year>=0){
                if (year%100==0){
                    if (year%400==0){
                        System.out.println(year+" bir artık yıldır.");
                    }
                    else {
                        System.out.println(year+" bir artık yıl değildir.");
                    }

                } else if (year%4==0) {
                    System.out.println(year+" bir artık yıldır.");
                }
                else {
                    System.out.println(year+" bir artık yıl değildir.");
                }

            }
            else {
                System.out.println("Geçersiz bir değer girdiniz!");
            }
        }
        else {
            System.out.println("Geçersiz bir değer girdiniz!");
        }
    }
}
