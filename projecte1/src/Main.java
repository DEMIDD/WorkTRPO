import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        if (N > 0) {
            int[] numArray = new int[N];

            for (int i = 0; i < N; i++) {
                numArray[i] = scan.nextInt();
            }

            if (N % 2 == 0) {
                for (int i = 0; i < N; i++) {

                    System.out.println(numArray[N - (i + 1)]);
                }
            } else {
                for (int i = 0; i < N; i++) {

                    System.out.println(numArray[i]);
                }

            }

        }

    }
}