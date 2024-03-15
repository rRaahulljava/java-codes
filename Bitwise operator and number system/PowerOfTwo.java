import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a num : ");
     int n = in.nextInt(); // note : fix for n = 0.
     boolean ans = (n & (n - 1)) == 0;
        System.out.println(ans);
    }

}
