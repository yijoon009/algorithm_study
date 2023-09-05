public class Main {
    public static void main(String[] args) {

     Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int total = 0;

        for(int i=1;i<a+1;i++) {
            total += i;

        }
        System.out.println(total);

    }
}
