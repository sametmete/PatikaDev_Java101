import java.util.Scanner;
public class UcakBiletiFiyatHesaplama {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age, tripType,distance;
        double totalAmount,ageDiscountKids=0.5,ageDiscountYoung=0.10,ageDiscountOld=0.3,roundTripDiscount=0.2,distanceAmount = 0.10;
        boolean isError = false;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scan.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scan.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        tripType = scan.nextInt();

        totalAmount = distance*distanceAmount;


        if (age>=0 && distance>=0){

            if (age<=12) {
                totalAmount = totalAmount-(totalAmount*ageDiscountKids);
            } else if (age>12 && age<=24) {
                totalAmount = totalAmount-(totalAmount*ageDiscountYoung);
                
            } else if (age>=65) {
                totalAmount = totalAmount-(totalAmount*ageDiscountOld);
                
            }

            switch (tripType) {
                    case 1:
                        totalAmount = totalAmount;
                        break;
                    case 2:
                        totalAmount = 2*(totalAmount-(totalAmount*roundTripDiscount));
                        break;
                    default:
                        isError = true;
                }

        }
        else {
            isError = true;
        }

        if (isError){
            System.out.println("Hatalı veri girdiniz!");
        }
        else {
            System.out.println("Toplam tutar : "+totalAmount);
        }
    }
}
