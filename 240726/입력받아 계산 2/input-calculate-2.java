import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int result = printInt();
        System.out.println(result);
    }

    public static int printInt(){
        int result = 0;
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        result = a*b;
        return result;
    }
}