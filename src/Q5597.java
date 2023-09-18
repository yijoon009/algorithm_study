package kist.reward.api.paper.service;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[28];
        int[] student = IntStream.rangeClosed(1, 30).toArray();

//        Arrays.stream(student).forEach(num -> System.out.println(num));
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int[] none = IntStream.of(student)
                .filter(num -> IntStream.of(arr).noneMatch(a -> a == num)).toArray();

        OptionalInt min = Arrays.stream(none).min();
        if (min.isPresent()) {
            System.out.println(min.getAsInt());
        }

        Arrays.stream(none).filter(num -> !min.isPresent() || num != min.getAsInt())
                .forEach(System.out::println);

    }
}
