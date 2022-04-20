import java.util.Scanner;
public class BurcBulanProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ay;
        int gun;
        System.out.print("Doğduğunuz ayı yazınız : ");
        ay = scan.nextLine();

        System.out.print("Doğduğunuz günü giriniz : ");
        gun = scan.nextInt();

        if (gun >= 1 && gun <= 31) {
            if (ay.toUpperCase().equals("OCAK")) {
                if (gun <= 21) {
                    System.out.println("Burcunuz Oğlak");
                } else {
                    System.out.println("Burcunuz Kova");
                }
            }

            if (ay.toUpperCase().equals("ŞUBAT")) {
                if (gun <= 19) {
                    System.out.println("Burcunuz Kova");
                } else {
                    System.out.println("Burcunuz Balık");
                }
            }
            if (ay.toUpperCase().equals("MART")) {
                if (gun <= 20) {
                    System.out.println("Burcunuz Balık");
                } else {
                    System.out.println("Burcunuz Koç");
                }
            }
            if (ay.toUpperCase().equals("NİSAN")) {
                if (gun <= 20) {
                    System.out.println("Burcunuz Koç");
                } else {
                    System.out.println("Burcunuz Boğa");
                }
            }
            if (ay.toUpperCase().equals("MAYIS")) {
                if (gun <= 21) {
                    System.out.println("Burcunuz Boğa");
                } else {
                    System.out.println("Burcunuz İkizler");
                }
            }
            if (ay.toUpperCase().equals("HAZİRAN")) {
                if (gun <= 22) {
                    System.out.println("Burcunuz İkizler");
                } else {
                    System.out.println("Burcunuz Yengeç");
                }
            }
            if (ay.toUpperCase().equals("TEMMUZ")) {
                if (gun <= 22) {
                    System.out.println("Burcunuz Yengeç");
                } else {
                    System.out.println("Burcunuz Aslan");
                }
            }
            if (ay.toUpperCase().equals("AĞUSTOS")) {
                if (gun <= 22) {
                    System.out.println("Burcunuz Aslan");
                } else {
                    System.out.println("Burcunuz Başak");
                }
            }
            if (ay.toUpperCase().equals("EYLÜL")) {
                if (gun <= 22) {
                    System.out.println("Burcunuz Başak");
                } else {
                    System.out.println("Burcunuz Terazi");
                }
            }
            if (ay.toUpperCase().equals("EKİM")) {
                if (gun <= 22) {
                    System.out.println("Burcunuz terazi");
                } else {
                    System.out.println("Burcunuz Akrep");
                }
            }
            if (ay.toUpperCase().equals("KASIM")) {
                if (gun <= 21) {
                    System.out.println("Burcunuz Akrep");
                } else {
                    System.out.println("Burcunuz Yay");
                }
            }
            if (ay.toUpperCase().equals("ARALIK")) {
                if (gun <= 21) {
                    System.out.println("Burcunuz Yay");
                } else {
                    System.out.println("Burcunuz Oğlak");
                }
            }
        }else {
            System.out.println("Geçersiz bir tarih girdiniz!");
        }
    }
}
