

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        StringBuilder sb = new StringBuilder(word);
        String reverse = sb.reverse().toString();
        if (word.equals(reverse)) {
            System.out.println("1");
        } else {
            System.out.println("0");
        }
    }
}
