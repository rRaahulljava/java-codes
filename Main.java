public class Main {
    public static void main(String[] args) {
        int[] arr =  {0, 1, 2, -3, -1};
        int x = -2;
        System.out.println(check(arr, x));


    }
    static boolean check(int[] arr, int x) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == x) {
                    return true;
                }
            }
        }
        return false;
    }
}