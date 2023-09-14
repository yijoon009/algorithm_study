

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] numArr = new int[n];

        for (int i = 0; i < m; i++) {
            int j = scanner.nextInt();
            int k = scanner.nextInt();
            int l = scanner.nextInt();
            for (int a = j; a <= k; a++) {
                int idx = a-1;
                numArr[idx] = l;
            }
        }

        Arrays.stream(numArr).forEach(num -> System.out.print(num+" "));
    }
}
