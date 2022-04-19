package Task2;

import com.github.javafaker.Faker;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Faker faker = new Faker();
        List<Human> humans = Stream.generate(() -> new Human((int) (Math.random()*50 + 18), faker.name().firstName(), faker.name().lastName(),
                LocalDate.of(2022 - (int) (Math.random()*50 + 7), (int) (Math.random()*12) + 1,
                        (int) (Math.random()*27) + 1), (int) (Math.random()*50 + 40))).limit(50).collect(Collectors.toList());
        humans.stream().filter(x -> x.getAge() > 20).sorted(((o1, o2) -> o2.getFirstName().compareTo(o1.getFirstName()))).limit(3).forEach(s -> System.out.print(s.getFirstName() + " "));
//        humans = humans.stream().filter(x -> x.getFirstName().charAt(0) == 'A').sorted(((o1, o2) -> o2.getAge() - o1.getAge())).limit(10).collect(Collectors.toList());
//        humans.forEach(s -> System.out.print(s.getFirstName() + " " + s.getAge() + " | "));
//        System.out.println("\n" + humans.stream().mapToInt(e -> e.getAge()).average().getAsDouble());
    }
}
