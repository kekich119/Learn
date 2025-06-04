package application;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SoulutionCollect {
    public static List<Integer> getPositiveNumbers (Stream<Integer> stream){
        return stream
                .filter(x -> x > 0).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,3,4,5);
        System.out.println(getPositiveNumbers(stream));
    }
}
