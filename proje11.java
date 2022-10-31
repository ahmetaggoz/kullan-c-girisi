package Giris;
import java.util.Scanner;
public class proje11 {
    public static void main(String[] args) {
        String userName,password,sorgu,passwordNew;



        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adı : ");
        userName = inp.nextLine();
        System.out.print("Şifre : ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")){
            System.out.println("Giriş yaptınız !");
        }else{
            System.out.println("Bilgiler yanlış !");
            System.out.print("Şifrenizi sıfırlamak istiyor musunuz? evet/hayır yazın : ");
            sorgu = inp.nextLine();
            if(sorgu.equals("evet")){
                System.out.print("Yeni şifrenizi girin : ");
                passwordNew = inp.nextLine();
                if (passwordNew.equals("java123")){
                    System.out.print("Yeni şifre eski şifreyle aynı olamaz !");
                }else{
                    System.out.print("Şifre değiştirildi. ");
                }

            }
        }
    }
}
