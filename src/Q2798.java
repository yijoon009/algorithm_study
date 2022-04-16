import java.util.Scanner;

public class Main {
//public class Q2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int sum = 0;
        int tmp = 0;
        int[] numbers = new int[n];
        for (int i=0; i<n; i++){
            numbers[i] = sc.nextInt();
        }

        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int k=j+1; k<n; k++){
                    sum = numbers[i] + numbers[j] + numbers[k];
                    if(sum <= m && tmp < sum){
                        tmp = sum;
                    }
                }
            }
        }
        System.out.println(tmp);
    }
}
