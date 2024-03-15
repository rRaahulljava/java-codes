public class DupicateRotatedArray {
    public static void main(String[] args) {

    }
    static int search(int[] nums, int target) {
        int pivot = findPivotWithDupicate(nums);
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

// with duplicate
    static int findPivotWithDupicate(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2 ;
            // 4 case are here

            if( mid < end && arr[mid] > arr[mid +1]){
                return mid;
            }
            if(start < mid && arr[mid] < arr[mid - 1]){
                return mid - 1;
            }

            // if element at middle , start, end are equal, then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]){
                // skip the duplicate.
                // NOTE:- what if the elements at start and end were the pivot???
                //check if start is pivot
                if (arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                // check whether end is pivot
                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || arr[start] == arr[mid] || arr[mid] > arr[end]) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
