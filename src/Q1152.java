

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        String trimStr = str.trim();
        String[] trimStrSplit = trimStr.split(" ");
        if (trimStrSplit[0].equals("")){
            System.out.println("0");
        } else {
            System.out.println(trimStrSplit.length);
        }


    }
}
