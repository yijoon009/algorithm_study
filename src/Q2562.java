import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numArray = new int[9];
        for (int i = 0; i < 9; i++) {
            numArray[i] = scanner.nextInt();
        }
        OptionalInt max = Arrays.stream(numArray).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }
        for (int i = 0; i < 9; i++) {
            if (numArray[i] == max.getAsInt())
                System.out.println(i+1);
        }
    }
}
