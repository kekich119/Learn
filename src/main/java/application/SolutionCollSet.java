package application;

import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionCollSet {
    public static Set<String> getFilteredString(Stream<String> stream){
        return stream
                .filter(x -> x.length() > 6)
                .collect(Collectors.toSet());
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("z","Привет дурачок", "ZOVZ");
        System.out.println(getFilteredString(stream));
    }


}
