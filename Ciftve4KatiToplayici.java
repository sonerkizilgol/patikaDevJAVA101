import java.util.Scanner;

// Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

public class Ciftve4KatiToplayici {
    public static void main(String[] args) {
        int inp, sum=0;
        Scanner sc = new Scanner(System.in);

        do {
            inp = 0;
            System.out.print("Sayı giriniz: ");
            inp = sc.nextInt();
            sum += (inp%4 == 0) ? inp : 0;
        } while (inp%2 == 0 );
        System.out.print("Girdiğiniz dörde bölünebilen çift sayıların toplamı: " + sum);
    }



}
