import java.util.Scanner;

public class Main {

    public static String[] strings;

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        String str = scan.nextLine();
        strings =  new String[6];

        for (int i = 0; i < 6; i++) {
            strings[i] = scan.nextLine();
            if (strings[i] == strings[i+1]);
                strings [i] = null;

                    strings[i].equals(strings[i+1]);
                    strings[i]= null;

        }
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i] + ", ");
        }

    }
}