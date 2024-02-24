import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
//        arr[0] = 12;
//        arr[1] = 21;
//        arr[2] = 65;
//        arr[3] = 7;
//        arr[4] = 1;
//        System.out.println(arr[3]);

//        input using for loops
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//
//        for( int i : arr){
//            System.out.println(i + " "); // here num is represents the elements of array
//        }


    }
}
