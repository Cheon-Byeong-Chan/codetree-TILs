import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        char[] arr= sc.next().toCharArray();

        for(int i = 0; i<arr.length;i++) {
             
                if(arr[i] >= 'a' && arr[i] <='z') {
                    System.out.print((char)(arr[i] - 'a' + 'A'));
                } else if(arr[i] >= 'A' && arr[i] <= 'Z') {
                    System.out.print((arr[i]));
                }
            
        }
    }
}