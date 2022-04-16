import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
//public class Q1181 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] words = new String[n];
        List<String> finalList = new ArrayList<>();
        for(int i=0;i<n;i++){
            words[i] = sc.nextLine();
        }

        for (int i=0;i<n;i++){
            if(!finalList.contains(words[i])){
                finalList.add(words[i]);
            }
        }
        finalList.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.length() == o2.length()){
                    return o1.compareTo(o2);
                } else{
                    return Integer.compare(o1.length(), o2.length());
                }
            }
        });
        for(int i=0;i<finalList.size();i++){
            System.out.println(finalList.get(i));
        }
    }
}
