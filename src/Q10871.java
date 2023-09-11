package kist.reward.api;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n = in.nextInt();
        int x = in.nextInt();
        int[] numArr = new int[n];

        for(int i=0;i<n;i++) {
            int smallNum = in.nextInt();
            numArr[i] = smallNum;
        }

        List<Integer> smallerNum = Arrays.stream(numArr).filter(number -> x > number)
                .boxed().collect(Collectors.toList());
        smallerNum.forEach(num -> System.out.print(num + " "));
    }
}
