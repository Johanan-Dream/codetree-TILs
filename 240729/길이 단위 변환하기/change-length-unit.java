public class Main {
    public static void main(String[] args) {
        double ft = 30.48;
        int mi = 160934;

        double ftResult = ft * 9.2;
        double miResult = mi * 1.3;

        System.out.printf("9.2ft = %.1fcm\n", ftResult);
        System.out.printf("1.3mi = %.1fcm", miResult);
    }
}