import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numArray = new int[num];
        for (int i = 0; i < num; i++) {
            numArray[i] = scanner.nextInt();
        }
        OptionalInt min = Arrays.stream(numArray).min();
        OptionalInt max = Arrays.stream(numArray).max();
        if (min.isPresent() && max.isPresent()) {
            System.out.println(min.getAsInt()+" "+max.getAsInt());
        }
    }
}
