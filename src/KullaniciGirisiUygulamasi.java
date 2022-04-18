import java.util.Locale;
import java.util.Scanner;
public class KullaniciGirisiUygulamasi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName="Samet",password="samet1234",sifreSifirlama,newPassword;

        System.out.print("Kullanıcı adınızı giriniz : ");
        userName = scan.nextLine();
        System.out.println("Şifrenizi giriniz : ");
        password = scan.nextLine();

        if (userName.toUpperCase().equals("SAMET") && password.equals("samet1234")){
            System.out.println("Giriş başarılı.");
        }
        else {
            System.out.println("Eksik ya da hatalı bilgiler girdiniz lütfen tekrar deneyiniz.\nŞifrenizi sıfırlamak isterseniz 'evet' yazınız");
            sifreSifirlama = scan.nextLine();
            switch (sifreSifirlama.toUpperCase()){
                case "EVET":
                    System.out.print("Belirlemek istediğiniz yeni şifrenizi giriniz : ");
                    newPassword = scan.nextLine();
                    if (!password.equals(newPassword)){
                        password = newPassword;
                        System.out.println("Şifre başarılı bir şekilde oluşturuldu.");
                    }
                    else{
                        System.out.println("Şifre oluşturulamadı!");
                    }
                break;
                default:
                    System.out.println("Geçersiz bir cevap verdiniz!");
            }


        }

    }
}
