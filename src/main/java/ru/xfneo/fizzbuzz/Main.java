package ru.xfneo.fizzbuzz;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        try {
            n = Integer.parseInt(args[0]);
            if (n <= 0) throw new NumberFormatException();
        } catch (NumberFormatException | IndexOutOfBoundsException e) {
            System.out.println("The first argument must be a number and greater than 0.");
            System.exit(-1);
        }
        Main main = new Main();
        main.logicStreamAPI(n);
    }

    private void logic(int n) {
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }
    }

    private void logicStreamAPI(int n) {
        IntStream.range(1, n)
                .forEach((i) ->
                        System.out.println((i % 3 == 0 ? "Fizz" : "") + (i % 5 == 0 ? "Buzz" : i % 3 == 0 ? "" : i))
                );
    }
}