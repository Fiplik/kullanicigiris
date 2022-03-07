import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullaniciadi,sifre;

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        kullaniciadi=input.nextLine();
        System.out.print("Şifrenizi Giriniz:  ");
        sifre=input.nextLine();

        System.out.println("****************************");
        if (kullaniciadi.equals("123") && sifre.equals("123")){
            System.out.println("Giriş Başarılı.");}
            else{
                System.out.println("Giriş Başarısız");
            }

//Fiplik
        }
    }