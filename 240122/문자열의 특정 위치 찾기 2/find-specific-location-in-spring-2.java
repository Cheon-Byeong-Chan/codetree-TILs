import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        String[] arr = {"apple", "banana", "grape", "blueberry", "orange"};
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        int cnt = 0;
        for(int i =0; i <5; i++) {
            if(arr[i].charAt(3) == c.charAt(0) || c.charAt(0) == arr[i].charAt(2)) {
                System.out.println(arr[i]);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}