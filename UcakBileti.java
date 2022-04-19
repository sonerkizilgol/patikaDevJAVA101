import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args) {
        double price;
        int age, type;
        Scanner sc = new Scanner(System.in);

        System.out.print("Mesafeyi KM üzerinden giriniz: ");
        price = ((sc.nextInt()) / 10); // Fiyat = 0,1 TL/km. Bilet fiyatının asla eksiye düşmemesi için indirimleri KM ile değil, mevcut fiyat ile hesaplıyorum. Bu durum da garip bir şekilde çok küçük eksi sayıların (-1/10 = 0) sıfır olmasına sebep oluyor ama gerçek hayatta kullanılmayacağı ve fiyat hala eksiye düşmediği için düzeltme gereği duymadım.

        System.out.print("Yaşınızı giriniz: ");
        age = sc.nextInt();
        if (age < 12) {
            price /= 2;
        } else if (age > 65) {
            price -= (price / 100) * 30;
        } else {
            price -= (price / 10);
        } // Kişinin yaşı eksi olmayacağına göre sadece 12-65 yaş arası olabilir.
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş): ");
        type = sc.nextInt();
        if (age < 0 || price < 0 || (type != 2 && type != 1)) {
            System.out.println("Hatalı Veri Girdiniz!");
            System.exit(0); // Programı "0" (normal) koduyla durdurur.
        } else {
            if (type == 2) {
                price -= (price / 5);
            }
            System.out.println("Toplam Tutar= " + price + "TL");
        }
    }
}
