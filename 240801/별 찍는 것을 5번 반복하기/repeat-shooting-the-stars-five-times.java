public class Main {
    public static void main(String[] args) {
        writeStar();
    }

    public static void writeStar(){
        //10*5
        int width = 10;
        int height = 5;

        for(int i = 1; i <= height; i++){
            for(int j = 1; j <=width; j++ ){
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}