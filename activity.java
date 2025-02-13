import java.util.*;

public class activity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 0; i < y; i++) {
            s++;
        }
        System.out.println(s);
        sc.close();
    }
}
