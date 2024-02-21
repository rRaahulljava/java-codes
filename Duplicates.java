import java.util.List;
import java.util.ArrayList;

public class Duplicates {
    public static List<Integer> findDup(int[] arr ){
        List<Integer> duplicates = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[index] += n;
        }
//        List<Integer> duplicates = null;
        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                duplicates.add(i);
            }
        }
        return duplicates;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 6, 3, 1, 3, 6, 6 };

        System.out.println("The repeating elements are: ");
        List<Integer> ans = findDup(arr);
        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}
