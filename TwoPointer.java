import java.util.Arrays;

public class TwoPointer {
    public static void main(String[] args) {
        int[] arr = {-8, 1, 4, 6, 10, 45};
        int sum = 16;
        int l =arr.length;
        System.out.println(sumcheck(arr, sum, l));

    }
    static String sumcheck(int[] arr, int sum, int l){
        int s, e;

        Arrays.sort(arr);
        s = 0;
        e = l - 1;
        while(s < e){
            if ( arr[s] + arr[e] == sum)
                return "rahul";
                else if(arr[s] + arr[e] < sum)
                    s++;
                    else
                        e--;
        }
        return "false";

    }
}

