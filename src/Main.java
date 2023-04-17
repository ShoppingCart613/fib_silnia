import java.util.Date;

public class Main {
    public static void main(String[] args) {

        long start = System.nanoTime();
        silnia(10);
        long stop = System.nanoTime();
        System.out.println("czas wykonania silni iteracyjnie: " + (stop - start));
        long start2 = System.nanoTime();
        silnia2(10);
        long stop2 = System.nanoTime();
        System.out.println("czas wykonania silni rekurencyjnie: " + (stop2 - start2));

        start = System.nanoTime();
        fib(25);
        stop = System.nanoTime();
        System.out.println("czas wykonania fib iteracyjnie: " + (stop - start));
        start2 = System.nanoTime();
        fib2(25);
        stop2 = System.nanoTime();
        System.out.println("czas wykonania fib rekurencyjnie: " + (stop2 - start2));

    }
    public static int silnia(int x){
        int a = 1;
        for (int i = 1;x+1>i;i++){
            a *= i;
        }
        return a;
    }
    public static int silnia2(int x){
        if(x<2){
            return 1;
        }
        return x*silnia2(x-1);
    }
    public static int fib(int x){
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1;x>i;i++){
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
    public static int fib2(int x){
        if (x==1 || x==2)
            return 1;
        else
            return fib2(x-1)+fib2(x-2);
    }
}
