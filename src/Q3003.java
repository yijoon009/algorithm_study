
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArr = new int[6];
        int[] orgNum = {1, 1, 2, 2, 2, 8};
        for (int i = 0; i < 6; i++) {
            numArr[i] = scanner.nextInt();
        }
        for (int i = 0; i < numArr.length; i++) {
            int tmp = orgNum[i] - numArr[i];
            System.out.print(tmp + " ");
        }
    }
}
