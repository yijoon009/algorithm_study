package kist.reward.api;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in=new Scanner(System.in);
        int num = in.nextInt();
        int[] numArr = new int[num];

        for(int i=0;i<num;i++) {
            int num2 = in.nextInt();
            numArr[i] = num2;
        }

        int value = in.nextInt();

        int totalCount = (int) Arrays.stream(numArr).filter(number -> number == value).count();
        System.out.println(totalCount);
    }
}
