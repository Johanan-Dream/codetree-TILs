import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("\\.");

        int yyyy = sc.nextInt();
        int mm = sc.nextInt();
        int dd = sc.nextInt();

        System.out.print(mm + "-" + dd + "-" + yyyy);
    }
}