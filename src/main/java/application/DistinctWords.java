package application;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DistinctWords {

    public static Stream<String> getDistinct(ArrayList<String> list) {


        return list.stream().distinct();

    }

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("java");
        words.add("python");
        words.add("java");
        words.add("c++");
        words.add("python");

        getDistinct(words).forEach(System.out::println);
    }
}
