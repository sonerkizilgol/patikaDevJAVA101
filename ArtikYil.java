public class ArtikYil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); int yil;
        System.out.print("Yıl giriniz: ");
        yil = sc.nextInt();

        if (yil%4 == 0) {
            if (yil%100 == 0) {
                if (yil%400 == 0) {System.out.print(yil + " bir artık yıldır.");}
                else {System.out.print(yil + " bir artık yıl değildir.");}
            }
            else {System.out.print(yil + " bir artık yıldır.");
            }
        }
        else {
            System.out.print(yil + " bir artık yıl değildir.");
        }
    }
}
