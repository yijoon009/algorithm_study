package kist.reward.api.paper.service;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[10];
        int[] remain = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        for(int i = 0; i < arr.length; i++) {
            remain[i] = arr[i]%42;
        }
        System.out.println(Arrays.stream(remain).distinct().count());


    }
}
