

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String str = scanner.next();
        int total = 0;
        for(int i=0;i<str.length();i++) {
            total += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(total);

    }
}
