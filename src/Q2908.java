

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num1 = scanner.next();
        String num2 = scanner.next();

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(int i=num1.length()-1;i>=0;i--) {
            sb1.append(num1.charAt(i));
        }
        for(int i=num2.length()-1;i>=0;i--) {
            sb2.append(num2.charAt(i));
        }

        System.out.println(Integer.parseInt(sb1.toString()) > Integer.parseInt(sb2.toString()) ? Integer.parseInt(sb1.toString()) : Integer.parseInt(sb2.toString()));

    }
}
