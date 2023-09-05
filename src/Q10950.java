

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();
        int[][] twoDimArr = new int[A][];

        for (int i=0; i<A; i++) {
            int[] smallArr = new int[2];
            int num1 = in.nextInt();
            int num2 = in.nextInt();
            smallArr[0] = num1;
            smallArr[1] = num2;
            twoDimArr[i] = smallArr;
        }

        for(int i=0; i<A; i++) {
            int[] arr = twoDimArr[i];
            int num3 = arr[0];
            int num4 = arr[1];
            System.out.println(num3 + num4);
        }

    }
}
