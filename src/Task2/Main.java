package Task2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> integerStringHashMap = new HashMap<Integer, String>();
        ListPut.create(integerStringHashMap);
        Task2.print(integerStringHashMap)
                .forEach(System.out::println);
    }


}
