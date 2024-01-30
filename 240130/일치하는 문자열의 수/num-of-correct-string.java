import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String[] arr = new String[n];
        int cnt =0 ;
        for(int i =0 ; i < n; i++) {
            arr[i] = sc.next();
            if(arr[i].equals(a)) {
                cnt++;
            }   
        }
        System.out.println(cnt);

    }
}