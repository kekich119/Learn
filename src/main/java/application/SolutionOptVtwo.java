package application;

import java.util.Optional;

public class SolutionOptVtwo {

    public static void printFirstChar(String s) {
        Optional<String> str = Optional.ofNullable(s).filter(x -> !x.isEmpty());
        if (str.isEmpty()){
            System.out.println("Эта строка равна null");
        }else{
            System.out.println(str.get().charAt(0));
        }



    }

    public static void main(String[] args) {
        printFirstChar("Java");
        printFirstChar(null);
        printFirstChar("");
    }
}