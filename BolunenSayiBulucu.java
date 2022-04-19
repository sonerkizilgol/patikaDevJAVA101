import java.util.Scanner;
// Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
public class BolunenSayiBulucu {
    public static void main(String[] args) {
        int inp, i, nm = -1;
        double avg = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        inp = sc.nextInt();
        for (i = 0; i <= inp; i++) {
            if (i % 3 == 0 || i % 4 == 0) {
                avg += i;
                nm++;
            }
        }
        if (nm < 1) nm = 1;
        avg /= nm;
        System.out.print(inp + " sayısına kadar olan 3 ve 4'e tam bölünen sayıların ortalaması: " + avg);
    }
}
