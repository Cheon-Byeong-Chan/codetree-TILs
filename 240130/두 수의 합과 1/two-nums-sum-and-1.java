import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b; // 여기서 1이 몇갠지 체크
        String s = c + "";
        char[] arr = s.toCharArray();
        int cnt = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] =='1') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }   

}