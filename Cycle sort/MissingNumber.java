import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        missingNumber(arr);
        System.out.println(Arrays.toString(arr));

    }

    static int missingNumber(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]){
                swap(arr, i, correct);
            } else {
                i++;
            }
        }

        // search for first missing number
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j){
                System.out.println(j);
                return j;
            }
        }

        // case 2 :- when n is not there in array.
        return arr.length;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
