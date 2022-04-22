




public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {4,7,9,0,2,3,1,6,11,16,84, 55,32,18};
        for(int i=1; i<numbers.length; i++){            //(총 배열 크기-1 만큼 돌기)
            for(int j=0; j<numbers.length-1; j++){      //각 비교는 점점 줄어들기
                if(numbers[j] > numbers[j+1]){
                    int tmp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = tmp;
                }
            }
        }
        for (int num : numbers){
            System.out.println(num);
        }
    }
}
