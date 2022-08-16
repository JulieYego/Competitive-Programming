package Arrays;
//Time complexity - O(log n) binary search
//Space complexity - O(log n) recursive function calls
public class sortedSearch {
    static int binarySearch(int arr[], int low, int high, int key){
        if (high < low) {  //the element is not present
            return -1;
        }             
         int mid = (low + high)/2;
         
         if (key == arr[mid]) {
            return mid;
         }
         if (key > arr[mid]) {
            return binarySearch(arr, (mid + 1), high, key);
         }
         return binarySearch(arr, low, (mid - 1), key);
    }

    public static void main(String[] args) {
        int arr[] = {23, 34, 44, 54, 64, 74, 84, 94};
        int high = (arr.length - 1);
        int key = 23;

        int pos = binarySearch(arr, 0, high, key);
        System.out.println("Index of element "+ key + " is " + pos);
    }
}
