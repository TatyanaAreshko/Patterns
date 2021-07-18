package math;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);
        System.out.println("Curent list: " + numbers);
        List<Integer> result = numbers.stream()
                .map(number -> number % 2 == 0 ? number * 100: number - 100)
                .collect(Collectors.toList());

        System.out.println("Result list: " + result);
    }
}
