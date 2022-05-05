import java.util.Scanner;
public class ATMProjesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int balance=1500,right=3,quantity,select;
        String userName,password;

        while (right > 0){

            System.out.print("Kullanıcı adınızı giriniz : ");
            userName = scan.nextLine();
            System.out.print("Şifrenizi giriniz : ");
            password = scan.nextLine();
            if (userName.toUpperCase().equals("SAMET") && password.toLowerCase().equals("samet1234")){
                System.out.println("Merhaba Osmanlı Bankasına Hoşgeldiniz");
                do {
                    System.out.println("Para yatırmak için -----> 1\n" +
                            "Para çekmek için -----> 2\n" +
                            "Bakiye sorgulamak için -----> 3\n" +
                            "Çıkış yapmak için -----> 4\n");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçinizi : ");
                    select = scan.nextInt();
                    switch (select){
                        case 1:
                            System.out.print("Yatırmak istediğiniz miktarı giriniz :");
                            quantity = scan.nextInt();
                            balance += quantity;
                            System.out.println("İşleminiz başarılı bir şekilde gerçekleşmiştir.");
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz miktarı giriniz : ");
                            quantity = scan.nextInt();
                            if (quantity>balance){
                                System.out.println("Yetersiz bakiye lütfen başka bir tutar giriniz.");
                            }
                            else {
                                balance -= quantity;
                                System.out.println("İşleminiz başarılı bir şekilde gerçekleşmiştir.");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : "+balance);
                            break;
                        case 4:
                            System.out.println("İyi günler dileriz hoşçakalın.");
                            break;
                        default:
                            System.out.println("Geçersiz bir seçim yaptınız lütfen tekrar deneyiniz.");
                            break;
                    }

                }while (select != 4);
                break;
            }else {
                --right;
                if (right == 0){
                    System.out.println("Hatalı bilgi girme hakkınız tükendiği için hesabınız blokelenmiştir bankanız ile iletişime geçiniz.");
                }else {
                    System.out.println("Kullanıcı adınız ya da parolanız hatalı lütfen tekrar deneyiniz. Kalan hakkınız : " + right);
                }
            }
        }




    }
}
