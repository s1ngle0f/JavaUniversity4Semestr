package Task1;

import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEvenNumber = x -> Math.log(x)/Math.log(2) == (int)(Math.log(x)/Math.log(2));
        System.out.println(isEvenNumber.test(8));
    }
}
