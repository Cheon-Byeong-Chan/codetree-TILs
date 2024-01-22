import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String[] s = new String[n];
        for(int i =0 ; i < n; i++) {
            s[i] = sc.next();
        }

        int cnt = 0; 
        int cnt2 = 0;
        for(int i = 0; i < n; i++) {
            int cnt1 = s[i].length();
            cnt += cnt1;

            if(s[i].charAt(0) == 'a') {
                cnt2++;
            }
        }
        System.out.println(cnt + " " + cnt2);
    }
}