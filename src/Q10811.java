

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] numArr = IntStream.rangeClosed(1, n).toArray();
        for (int i = 0; i < m; i++) {
            int j = scanner.nextInt()-1;
            int k = scanner.nextInt()-1;

            while (j < k) {
                int tmp = numArr[j];
                numArr[j++] = numArr[k];
                numArr[k--] = tmp;
            }
        }
        Arrays.stream(numArr).forEach(num -> System.out.print(num + " "));
    }
}
