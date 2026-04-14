package u4cpp;

public class Search {
    // recursive binary search
    public static int binarySearch(int[] arr, int targetNumber){
        return binarySearch(arr, targetNumber, 0, arr.length - 1);
    }

    //helper for recursion
    private static int binarySearch(int[] arr, int targetNumber, int low, int high){
        if (low > high){
            return -1;
        }

        int mid = (low + high) / 2;

        if (arr[mid] == targetNumber){
            return mid;
        }else if (targetNumber < arr[mid]){
            return binarySearch(arr, targetNumber, low, mid - 1);
        }else {
            return binarySearch(arr, targetNumber, mid + 1, high);
        }
    }
}