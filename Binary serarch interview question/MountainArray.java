public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 6, 4, 2};
        System.out.println(peakIndexInMountainArray(arr));

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
}

