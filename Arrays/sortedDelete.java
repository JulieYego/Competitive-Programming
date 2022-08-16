package Arrays;
//Time complexity - O(n)
//Space complexity - O(log n)
public class sortedDelete {
    static int findElement(int arr[], int low,int high, int key){
        int mid = (low + high)/ 2;

        if (key == arr[mid]) {
            return mid;
        }

        if (key > arr[mid]) {
            low = mid + 1;
            return findElement(arr, low, high, key);
        }

        if (key < arr[mid]) {
            high = mid - 1;
            return findElement(arr, low, high, key);
        }

        return -1; //element not present
    }

    static int deleteElement(int arr[], int n, int key){
        int index = findElement(arr, 0, (n-1), key); 

        if(index == -1){
            System.out.println("Element not found");
        }

        for(int i = index; i < n-1; i++){
            arr[i] = arr[i + 1];
        }

        return n - 1;
    }

    public static void main(String[] args) {
        int arr[] = {19, 23, 28, 31, 39, 44, 47, 53, 69};
        int n = 9;
        int key = 39;

        System.out.println("BEFORE : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        n = deleteElement(arr, n, key);

        System.out.println("\nAFTER : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
