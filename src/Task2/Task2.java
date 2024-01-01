package Task2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static List<String> print(Map<Integer,String> stringMap){
        List<String> list = stringMap.entrySet().stream()
                .filter(x -> Arrays.asList(1, 2, 5, 8, 9, 13).contains(x.getKey()))
                .filter(i -> i.getValue().length() % 2 != 0)
                .map(i -> new StringBuilder(i.getValue()).reverse().toString())
                .toList();
        return list;
    }
}
