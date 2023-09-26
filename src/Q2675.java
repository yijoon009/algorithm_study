
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] repArr = new int[num];
        String[] repStr = new String[num];

        for (int i = 0; i < num; i++) {
            repArr[i] = scanner.nextInt();
            repStr[i] = scanner.next();
        }

        for (int i = 0; i < num; i++) {
            int repp = repArr[i];
            String str = repStr[i];

            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                for (int k = 0; k < repp; k++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }


    }
}
