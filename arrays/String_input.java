import java.util.Arrays;
import java.util.Scanner;

public class String_input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] str = new String[5];
        System.out.println("Enter the five character.");

        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

//    we can also modify tghe array element.
        str[1] = "kunal";
        System.out.println(Arrays.toString(str));


    }
}
