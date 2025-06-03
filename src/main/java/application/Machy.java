package application;

import java.util.stream.Stream;

public class Machy {
    public static void main(String[] args) {

    }


    boolean hasNegativeEvenNumbers(Stream<Integer> stream){
        if(stream.anyMatch(x -> x < 0 && x % 2 == 0)){
            return true;
        }else {
            return false;
        }
    }
}
