package math;

public class Fibonacci {
    public static void main(String[] args) {
        //Фибоначчи: F0 = 0, F1 = 1, Fn = Fn-1 + Fn-2;  n>=0
            int a1 = 0;
            int a2 = 1;
            int n = 10;

        for(int i = 1; i <= n; i++){
            System.out.print(a1 + " / ");
            int nextval = a1 + a2;
            a1 = a2;
            a2 = nextval;
        }
    }
}
