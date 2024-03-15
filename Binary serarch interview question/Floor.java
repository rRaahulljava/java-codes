public class Floor {

        public static void main(String[] args) {
            // ceiling of a number = smallest element in array greater or equal to target
            int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89 };
            int target = 17;
            int ans = floor(arr, target);
            System.out.println(ans);

        }
        static int floor(int[] arr, int target){

            // what if target is smaller than the smallest number in the array
            if(target < arr[0]){
                return -1;
            }
            int start = 0;
            int end = arr.length - 1;

            while (start <= end){
//            find the middle element
//            int mid = (start + end)/2;  but might be possible that (start + end) exceeds the range of int in java
                int mid = start + ( end - start) / 2;

                if (target < arr[mid]){
                    end = mid - 1;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                }else{
//                ans found
                    return mid;
                }
            }
            return end;
        }
    }

