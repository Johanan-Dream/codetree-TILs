import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double ft = sc.nextDouble();
        ft = ft * 30.48;

        System.out.printf("%.1f", ft);
    }
}