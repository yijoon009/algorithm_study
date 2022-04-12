import java.util.Scanner;

//public class Main {
public class Q1259 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String number = sc.next();
            String reverseNum = "";
            if(number.equals("0")){
                break;
            }
            for (int i=number.length() - 1; i>=0; i--){
                reverseNum += number.charAt(i);
            }
            if(reverseNum.equals(number)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
//            System.out.println(number);
//            System.out.println(reverseNum);

        }
    }
}
