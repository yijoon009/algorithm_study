

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.next();
        for (char c = 'a' ; c <= 'z' ; c++) {
            System.out.print(str.indexOf(c) + " ");
        }


    }
}
