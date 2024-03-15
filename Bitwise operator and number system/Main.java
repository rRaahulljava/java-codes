public class Main {
    public static void main(String[] args) {
        isOdd(76);

    }

    static void isOdd(int n){
        if((n & 1) == 1){
            System.out.println("number is odd");
        } else {
            System.out.println(" number is even");
        }
//        return (n & 1) == 1;
    }
}