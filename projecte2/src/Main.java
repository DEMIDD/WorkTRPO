
import java.util.Scanner;

public class Main {
    public static int[] array;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i = 0; 1 < N; i++) {
            array[i] = scan.nextInt();
        }
        int min = array[0];

        for (int i = 1; i < N; i++){
            if (array[i] < min)

                min = array[i];

        }
        System.out.println(min);
    }
}