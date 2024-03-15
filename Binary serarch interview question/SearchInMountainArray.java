public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr, target));

    }

   static int search(int[] arr,int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = binarysearch(arr, target, 0, peak);
        if(firstTry != -1){
            return firstTry;
        }
        // try to search in second half
        return binarysearch(arr, target, peak+1, arr.length-1);
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end =  arr.length -1;

        while(start < end){
            int mid = start +  (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                // you are in dec part ofarry this may be the ans, but look at left
                // this is why end not equal to mid - 1.
                end = mid;
            } else{
                // you  are in asc part of array
                start = mid +1; // becaue we know that mid + 1 elment > mid element.
            }
        }
        // in the end , start == end and ponting to the largest number becaue of the 2 check above
        // start and end are always trying to find max element in the above check
        // hence they are pointing to just one element,  that is the max one because that is what the checks say

        return start; // return or end
    }
    public static int binarysearch(int[] arr, int target, int start, int end){
//

//        find whether the array is ascending or descending order.
        boolean isAsc = arr[start] < arr[end];
//        boolean isAsc;
//        if(arr[start] < arr[end]){
//            isAsc = true;
//        }else {
//            isAsc = false;
//        }


        while (start <= end){
//            find the middle element
//            int mid = (start + end)/2;  but might be possible that (start + end) exceeds the range of int in java
            int mid = start + ( end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if(isAsc){
                if (target < arr[mid]){
                    end = end - 1;
                } else  {
                    start = start + 1;
                }
            } else {
                if (target > arr[mid]){
                    end = end - 1;
                } else  {
                    start = start + 1;
                }
            }
        }
        return -1;
    }
}
