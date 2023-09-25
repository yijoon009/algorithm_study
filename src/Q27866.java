

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.next();
        int n = scanner.nextInt();

        System.out.println(string.charAt(n-1));
    }
}
