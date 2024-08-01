import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        x+=8;
        System.out.printf("%d\n", x);

        y*=3;
        System.out.printf("%d\n", y);

        System.out.print(x*y);
    }
}