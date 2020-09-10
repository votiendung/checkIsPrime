import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        while(i < 5){
            if(i % 3 != 0){
                i++;
                break;
            }
            System.out.println("Hello");
            i++;
        }

    }
}
