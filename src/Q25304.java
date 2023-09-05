

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = in.nextInt();
        int count = in.nextInt();
        int[][] twoDimArr = new int[count][];
        int totalWon = 0;

        for (int i=0; i<count; i++) {
            int[] smallArr = new int[2];
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            smallArr[0] = num1;
            smallArr[1] = num2;
            twoDimArr[i] = smallArr;
        }

        for(int i=0; i<count; i++) {
            int[] arr = twoDimArr[i];
            int num3 = arr[0];
            int num4 = arr[1];
            totalWon += num3*num4;
        }
        if (totalWon == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
