package kist.reward.api.paper.service;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] numArr = new int[n];

        // Stream을 사용하여 numArr 배열 초기화
//        numArr = IntStream.rangeClosed(1, n).toArray();

        for(int i = 0; i<n;i++) {
            numArr[i] = i+1;
        }

        for(int i = 0; i<m;i++) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            int tmp = numArr[j-1];
            numArr[j - 1] = numArr[k - 1];
            numArr[k - 1] = tmp;
        }

        Arrays.stream(numArr).forEach(num -> System.out.print(num + " "));




    }
}
