import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(5);

        Scanner imp = new Scanner(System.in);
        int right = 0;
        int select;
        System.out.println(number);

        while (right < 5) {
            System.out.print("Lütfen Sayı Tahmininizi Giriniz :");
            select = imp.nextInt();
            if (select == number) {
                System.out.println("Tebrikler Doğru Sayıyı Buldunuz :)");
                break;
            } else {
                System.out.println("Seçtiğiniz Sayı Doğru Değil Tekrar Deneyin");
            }
            if (select < 0 || select > 99) {
                System.out.println("Sayınız 0 ile 100 Arasında Olmaı!");
                continue;

            } else if (select < number) {
                System.out.println("Doğru Cevap İçin Sayıyı Yükseltmeniz gerekiyor");
            } else {
                System.out.println("Doğru Cevap İçin Sayıyı Düşürmeniz Gerekiyor");
            }

            right++;
            System.out.println("Kalan hakkınız :" + (5 - right));
        }
        System.out.println("Doğru Sayı :" + number);
    }
}
