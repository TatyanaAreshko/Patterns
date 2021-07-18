package math;

public class Chars {
    public static void main(String[] args) {
        char1();
        char2();
    }

   //Разбить посимвольно
    public static void char1(){
        String word = "Programming";
        char[] chars = word.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.print("[" + chars[i] + "]");
        }
        System.out.println(" ");
    }

    //Разбиение построчно
    public static void char2(){
        String word = "Java is programming language";
        for (String retval : word.split(" ")){
            System.out.println(retval);
        }

    }

}
