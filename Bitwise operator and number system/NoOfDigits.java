public class NoOfDigits {
    public static void main(String[] args) {

        int n = 74758;
        int b = 10;

        int ans = (int)(Math.log(n) / Math.log(b)) + 1; // its time complexity is log n times

        System.out.println(ans);

    }

}
