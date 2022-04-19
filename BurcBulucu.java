import java.util.Scanner;

public class BurcBulucu {
    public static void main(String[] args) {
        int m, d;
        Scanner sc = new Scanner(System.in);

        System.out.print("Doğduğunuz ay (sayı): ");
        m = sc.nextInt();

        System.out.print("Doğduğunuz gün (sayı): ");
        d = sc.nextInt();
        System.out.print("Burcunuz ");
        if (m == 1) { // Ocak
            System.out.print((d > 21) ? "Kova" : "Oğlak");
        }
        else if (m == 2) { //Şubat
            System.out.print((d > 19) ? "Balık" : "Kova");
        }
        else if (m == 3) { //Mart
            System.out.print((d > 20) ? "Koç" : "Balık");
        }
        else if (m == 4) { //Nisan
            System.out.print((d > 20) ? "Boğa" : "Koç");
        }
        else if (m == 5) { //Mayıs
            System.out.print((d > 21) ? "İkizler" : "Boğa");
        }
        else if (m == 6) { //Haziran
            System.out.print((d > 22) ? "Yengeç" : "İkizler");
        }
        else if (m == 7) { //Temmuz
            System.out.print((d > 22) ? "Aslan" : "Yengeç");
        }
        else if (m == 8) { //Ağustos
            System.out.print((d > 22) ? "Başak" : "Aslan");
        }
        else if (m == 9) { //Eylül
            System.out.print((d > 22) ? "Terazi" : "Başak");
        }
        else if (m == 10) { //Ekim
            System.out.print((d > 22) ? "Akrep" : "Terazi");
        }
        else if (m == 11) { //Kasım
            System.out.print((d > 21) ? "Yay" : "Akrep");
        }
        else if (m == 12) { //Aralık
            System.out.print((d > 21) ? "Oğlak" : "Yay");
        }
    }
}
