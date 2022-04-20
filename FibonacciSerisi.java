import java.util.Scanner;

public class FibonacciSerisi {
    static int fib(int i){
        if ( i == 1 || i == 2) {
            return 1;
        }
        return fib(i - 1) + fib(i - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Fibonacci Serisini bulmak istediğiniz sayıyı giriniz: ");
        int inp = sc.nextInt();

        System.out.println(inp+" sayısının Fibonacci Serisi: "+ fib(inp));
    }
}
