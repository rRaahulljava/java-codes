public class RotatedBS {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findPivot(arr));
    }

   static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        // if you did not found a pivot , its means the array is not rotated.
       if(pivot == -1){
           // just do normal binary search
           return binarysearch(nums, target, 0,nums.length-1);
       }
       // if pivot is found, you have found 2 asc sorted arrays
       if (nums[pivot] == target){
           return pivot;
       }
       if (target >= nums[0]){
           return binarysearch(nums, target, 0, pivot -1);
       }
       return binarysearch(nums, target, pivot+1, nums.length-1);

    }static int binarysearch(int[] arr, int target, int start, int end){


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
        return -1;
    }

    // this will not work for the duplicate value.
    static int findPivot(int[] arr){
        int start1 = 0;
        int end1 = arr.length - 1;

        while(start1 <= end1){
            int mid = start1 + (end1 - start1) / 2 ;
            // 4 case are here

            if( mid < end1 && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(start1 < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start1]){
                end1 = mid - 1;
            } else {
                start1 = mid + 1;
            }
        }
        return -1;
    }
}
