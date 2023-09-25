package kist.reward.api.reward.repository;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] numArr = new int[n];
        float[] newNumArr = new float[n];
        float total = 0.0F;

        for(int i=0; i<n; i++) {
            numArr[i] = scanner.nextInt();
        }

        OptionalInt max = Arrays.stream(numArr).max();
        int maxInt = max.getAsInt();

        for(int i=0; i<n; i++) {
            newNumArr[i] = ((float) numArr[i] /maxInt)*100;
            total += newNumArr[i];
        }
        System.out.println(total/n);
    }
}
