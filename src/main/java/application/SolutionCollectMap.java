package application;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionCollectMap {
    public static Map<String,Integer> getMap(Stream<String> stream){
        return stream
                .collect(Collectors.toMap(s -> s,s -> s.length()));
    }

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("java","Code", "GPT");
        System.out.println(getMap(stream));
    }

}
