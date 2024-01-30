import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        char[] arr = s.toCharArray();
        arr[1] = 'a';
        arr[arr.length-2] = 'a';

        s = String.valueOf(arr);
        System.out.println(s);
    }
}