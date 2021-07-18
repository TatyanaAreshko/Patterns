package math;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Факториал равен " + getFactorial(5));
        System.out.println("Факториал с рекурсией равен " + getRecFactorial(5));
    }


    //Факториал обычный
    public static int getFactorial(int f){
        int result = 1;
        for(int i = 1; i <= f; i++){
            result *= i;
        }
        return result;
    }

    //Факториал с рекурсией
    public static int getRecFactorial(int f){
        if (f == 0 || f == 1){
            return 1;
        }
        else {
            return f * getRecFactorial(f - 1);
        }
    }

}
