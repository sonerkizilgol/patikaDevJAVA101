import java.util.Scanner;
// Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

public class DortveBesKuv {
    public static void main(String[] args) {
        int i4, i5 = 1, inp;
        Scanner sc = new Scanner(System.in);
        System.out.print("Sınır sayısını giriniz: ");
        inp = sc.nextInt();

        for (i4 = 1; i4 <= inp; i4 *= 4) { // 1 sayısıyla başlıyor çünkü her sayının sıfırıncı katı 1'dir.
            System.out.print(i4 + ", ");
            if (i4 == 1) continue; // 5 sayısı 1'den ve 4'ten büyük olduğu için önce 4 yazdırılıyor.
            i5 *= 5;
            if (i5 % 4 != 0 && i5 <= inp)
                System.out.print(i5 + ", "); // Sayı tekrarından kaçınmak için ancak beşin katı olan sayı 4'e tam bölünmüyorsa yazdırılıyor.
        }
    }
}
