public class SetBits {
    public static void main(String[] args) {
        int n = 6770;
        System.out.println(Integer.toBinaryString(n));

        System.out.println(digits(n));
    }

     static int digits(int n) {
        int count = 0;

//        while (n > 0){
//            count++;
//            n = n - (n & -n);
//        }
         // or

         while (n > 0){
             count++;
             n = n & (n - 1);

         }
        return count;
    }
}
