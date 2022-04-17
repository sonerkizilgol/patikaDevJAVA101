import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2; String islem;

        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = sc.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = sc.nextDouble();

        System.out.println("Yapmak istediğiniz işlem hangisi?");
        System.out.println("(Toplama, Çıkarma, Çarpma ya da Bölme diyebilirsiniz");
        System.out.print("Seçiminiz: ");
        islem = sc.next();

        switch (islem) {
            case "Toplama": case "toplama": case "topla": case "t": case "T":
                System.out.println((n1) + " + " + n2 + " = " + (n1+n2) );
                break;
            case "Çıkarma": case "çıkarma": case "cıkarma": case "Cıkarma": case "ci": case "Ci": case "çı": case "Çı":
                System.out.println((n1) + " - " + n2 + " = " + (n1-n2) );
                break;
            case "Çarpma": case "çarpma": case "Carpma": case "carpma": case "c": case "C": case "ç": case "Ç":
                System.out.println((n1) + " x " + n2 + " = " + (n1*n2) );
                break;
            case "Bölme": case "bölme": case "B": case "b":
                /* Normalde burada da switch kullanacaktım ama IntelliJ IDEA switch içerisinde switch kullanılmasını önermiyormuş; "Yapabilmek için preview özelliklerini etkinleştirmelisiniz" şeklinde uyarı verdi. */if (n2 == 0) {
                    System.out.println((n1) + " / " + n2 + " = Sıfıra Bölünemez!");
                } else {
                    System.out.println((n1) + " / " + n2 + " = " + (n1 / n2));
                }
                break;
            default:
                System.out.println("Hatalı Değer Girdiniz!");
        }
    }
}
