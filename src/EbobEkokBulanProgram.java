import java.util.Scanner;
public class EbobEkokBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2, ebob=1, ekok=0;
        boolean isError = false;

        System.out.print("1.say�y� giriniz : ");
        if(scan.hasNextInt()) {
            number1 = scan.nextInt();
            System.out.print("2.say�y� giriniz : ");
            number2 = scan.nextInt();
            if (number1 > 0 && number2 > 0) {
                int i = 1;

                if (number1 < number2) {
                    while (i <= number1) {
                        if (number1 % i == 0 && number2 % i == 0) {
                            ebob = i;
                        }
                        i++;
                    }
                } else {
                    while (i <= number2) {
                        if (number1 % i == 0 && number2 % i == 0) {
                            ebob = i;
                        }
                        i++;
                    }
                }
                ekok = (number1*number2)/ebob;
            } else {
                isError = true;
            }
        }else {
            isError = true;
        }

        if (isError){
            System.out.println("Yanl�� bir de�er girdiniz!");
        }
        else {
            System.out.println("Girdi�iniz say�lar�n EBOB'u : "+ebob);
            System.out.println("Girdi�iniz say�lar�n EKOK'u : "+ekok);
        }





    }
}
