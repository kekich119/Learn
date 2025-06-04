package application;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SolutionCollectJoin {
        public static String getString(Stream<String> stream) {

            return stream
                    .collect(Collectors.joining("/"));
    }

    public static void main(String[] args) {
            Stream<String> stream = Stream.of("Java","Stream","Collectors");
        System.out.println(getString(stream));
    }

}
