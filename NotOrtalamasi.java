import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
            System.out.print("Matematik Notunuz: ");
                matematik = inp.nextInt();
            System.out.print("Fizik Notunuz: ");
                fizik = inp.nextInt();
            System.out.print("Kimya Notunuz: ");
                kimya = inp.nextInt();
            System.out.print("Türkçe Notunuz: ");
                turkce = inp.nextInt();
           System.out.print("Tarih Notunuz: ");
                tarih = inp.nextInt();
            System.out.print("Müzik Notunuz: ");
                muzik = inp.nextInt();
        double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not ortalamanız: " + ortalama);
        //boolean basari = (ortalama >=
        System.out.println((ortalama >= 60) ? "Sınıfı Geçti" : "Sınıfta Kaldı"); // ayrı bi değişken ayarlamadan da yapabileceğimi farkettim, hehe
    }
}
