import java.util.Scanner;

//public class Main {
public class Q4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            int num3 = sc.nextInt();

//            System.out.println(num1);
//            System.out.println(num2);
//            System.out.println(num3);
            if((num1 == 0) && (num2 == 0) && (num3 == 0)){
                break;
            } else{
                int numOne = (int) Math.pow(num1, 2);
                int numTwo = (int) Math.pow(num2, 2);
                int numThree = (int) Math.pow(num3, 2);
                if((numOne + numTwo == numThree) || (numOne + numThree == numTwo) || (numThree+numTwo == numOne)){
                    System.out.println("right");
                }else {
                    System.out.println("wrong");
                }
            }
        }
    }
}
