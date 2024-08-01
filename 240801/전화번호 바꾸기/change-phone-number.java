import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int temp;

        temp = b;
        b = c;
        c = temp;

        System.out.print("0"+ a+ "-" + b + "-" +c);

    }
}