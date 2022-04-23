package PatikaDevJAVA101;
import java.util.Scanner;

public class HesapMakinesi2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int selection;

        String menu = "1- Toplama\n" + "2- Çıkarma\n" + "3- Çarpma\n" + "4- Bölme\n"
                + "5- Üslü Sayı Hesaplama\n" + "6- Mod Alma\n" + "7- Dikdörtgen Alan ve Çevresi Hesaplama\n"
                + "0- Çıkış";
        System.out.println(menu);
        do {
            System.out.print("Bir işlem seçiniz: ");
            selection = sc.nextInt();
            switch (selection) {
                case 1:
                    sum(); break;
                case 2:
                    minus(); break;
                case 3:
                    times(); break;
                case 4:
                    divide(); break;
                case 5:
                    uslu(); break;
                case 6:
                    mod(); break;
                case 7:
                    rectangle(); break;
            }
        } while (selection != 0);
    }
    private static int sayisec1() {
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz: ");
        return sc.nextInt();
    }
    private static int sayisec2() {
        int b;
        Scanner sc = new Scanner(System.in);
        System.out.print("İkinci sayıyı giriniz: ");
        return sc.nextInt();
    }
    private static void sum() {
        int a = sayisec1(), b = sayisec2();
        System.out.print(a + " + " + b + " = " + (a+b));
    }
    private static void minus() {
        int a = sayisec1(), b = sayisec2();
        System.out.print(a + " - " + b + " = " + (a-b));
    }
    private static void times() {
        int a = sayisec1(), b = sayisec2();
        System.out.print(a + " x " + b + " = " + (a*b));
    }
    private static void divide() {
        int a = sayisec1(), b = sayisec2();
        System.out.print(a + " ÷ " + b + " = " + (a/b));
    }
    private static void uslu() {
        int a = sayisec1(), b = sayisec2(), i = 1, result = a;
        while ( i < b) {
            result *= a;
            i++;
        }
        System.out.print(a + "^" + b + " = " + result);
    }
    private static void mod() {
        int a = sayisec1(), b = sayisec2();
        System.out.print(a + " mod " + b + " = " + (a%b));
    }
    private static void rectangle() {
        int a = sayisec1(), b = sayisec2();
        System.out.println("Çevresi= " + (2 * (a+b)));
        System.out.prinln("Alanı=" + (a*b));
    }
}
