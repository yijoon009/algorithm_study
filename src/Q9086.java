

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String[] stringArr = new String[num];
        for(int i = 0; i < num; i++) {
            stringArr[i] = scanner.next();
        }
        for(int i = 0; i < num; i++) {
            String string = stringArr[i];

            System.out.print(string.charAt(0));
            System.out.print(string.charAt(string.length()-1));
            System.out.println();
        }
    }
}
