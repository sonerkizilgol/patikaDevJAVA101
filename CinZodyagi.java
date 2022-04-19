import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int yil; String zodyak;

        System.out.print("Doğum Yılınızı Giriniz: ");
        yil = sc.nextInt();

        if (yil < 1000) {
            System.out.print("Lütfen en yakın bilim insanına görününüz."); // :)
        }
        else {
            switch (yil % 12){
                case 0: zodyak = "Maymun"; break;
                case 1: zodyak = "Horoz"; break;
                case 2: zodyak = "Köpek"; break;
                case 3: zodyak = "Domuz"; break;
                case 4: zodyak = "Fare"; break;
                case 5: zodyak = "Öküz"; break;
                case 6: zodyak = "Kaplan"; break;
                case 7: zodyak = "Tavşan"; break;
                case 8: zodyak = "Ejderha"; break;
                case 9: zodyak = "Yılan"; break;
                case 10: zodyak = "At"; break;
                default: zodyak = "Koyun"; break;
            }
            System.out.print("Çin Zodyağı Burcunuz: " + zodyak);
        }
    }
}
