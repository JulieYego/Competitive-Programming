package Arrays;
//Time complexity - O(n)
//Space complexity - O(1)
public class unsortedSearch {
    //function to imlement the searching
    static int search(int arr[], int n, int value){
        for (int i = 0; i < n; i++){
            if (arr[i] == value){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {12,34,10,6,40};
        int n = arr.length;
        int value = 4;

        int index = search(arr, n, value);

        if (index == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element at index: " + (index + 1));
        }
    }
}
