package Task1;

import java.util.List;

public class Task1 {
    public static void print(List<Integer> integers){
        int sum = integers.stream()
                .distinct()
                .filter(x -> x % 2 == 0)
                .peek(System.out::println)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum);
    }
}
