import java.util.Scanner;

public class RecursiveileFibonacciSerisi {

    static int fibo(int n){

        if(n==1 || n==0)
            return 1;

        return fibo(n-1)+fibo(n-2);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayý giriniz : ");
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibo(i));
            System.out.print(" ");
        }

    }
}
