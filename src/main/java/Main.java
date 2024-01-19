import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        // variables
        int endingNumber = 100_000;
        int startingNumber = 0;

        // stream for searching prime numbers
        IntStream
                .rangeClosed(startingNumber, endingNumber)
                .filter(Main::isPrime)
                .forEach(System.out::println);

        //stream for counting prime numbers
        long count = IntStream
                .rangeClosed(2, endingNumber)
                .filter(Main::isPrime)
                .count();

        // print results
        System.out.println("Ennyi darab prím számot találtam " + endingNumber + "-ig: " + count);
    }

    // method for checking the number for prime numbers theory
    private static boolean isPrime(int number) {
        return number > 1
                && IntStream
                .range(2, number)
                .noneMatch(i -> number % i == 0);
    }
}
