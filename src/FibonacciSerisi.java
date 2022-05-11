public class FibonacciSerisi {
    public static void main(String[] args) {

        int number=10,a=0,b=1,c;

        System.out.print(a);
        System.out.print(" "+b+" ");
        for(int i=1; i<=number; i++){
            c = a+b;
            System.out.print(c);

            a=b;
            b=c;
            System.out.print(" ");
        }

    }
}
