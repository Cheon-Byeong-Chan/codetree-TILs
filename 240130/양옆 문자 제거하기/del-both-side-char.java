import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        s = s.substring(0,1) + s.substring(2, arr.length-2) + s.substring(arr.length-1);
        System.out.println(s);
    }
}