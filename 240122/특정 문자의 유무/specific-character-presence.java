import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        String s1 = "ee";
        String s2 = "ab";

        if(s.contains(s1)) {
            System.out.print("Yes" + " ");
        }else {
            System.out.print("No" + " ");
        }

        if(s.contains(s2)) {
            System.out.print("Yes");
        }else {
            System.out.print("No");
        }

    }
}