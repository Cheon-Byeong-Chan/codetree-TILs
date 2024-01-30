import java.util.*;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String sA = sc.next();
        String sB = sc.next();

        String A = sA+sB;
        String B = sB+sA;

        int An = Integer.parseInt(A);
        int Bn = Integer.parseInt(B);

        System.out.println(An+Bn);
    }
}