

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String newWord = word.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : newWord.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        char mostFrequentChar = ' ';
        int maxCount = 0;
        boolean isTie = false;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                mostFrequentChar = entry.getKey();
                maxCount = entry.getValue();
                isTie = false;
            } else if (entry.getValue() == maxCount) {
                isTie = true;
            }
        }

        if (isTie) {
            System.out.println('?');
        } else {
            System.out.println(mostFrequentChar);
        }

    }
}
