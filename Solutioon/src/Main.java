
import java.util.Scanner;


public class Main {
    public static String[] strings;
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        String[] array = new String[10];
        array[0] = "Ho";
        array[1] = "Hi";
        array[2] = "Boy";
        array[3] = "Man";
        array[4] = "People";
        array[5] = array[1];
    for (int i = 0;  i < strings.length; i++){
        for (int j = i + 1; j < strings.length; j++) {
            if (strings[i] != null && strings[i].equals(strings[j])) {
                strings[j] = "null";
                System.out.print(strings[i] + ", ");
            }
        }
    }
    }
}