package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionSolution {
    public static void printList(List<String> list){
        for (String item: list){
            Optional<String> str = Optional.ofNullable(item);
            System.out.println(str.orElse(""));

        }
    }


    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("z");
        list.add("goyda");
        list.add(null);
        list.add(null);
        list.add("ZOV");
        printList(list);
    }
}
