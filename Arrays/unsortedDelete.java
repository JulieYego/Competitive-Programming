package Arrays;
//Time complexity - O(n)
//Space complexity - O(1)

public class unsortedDelete {
    //array is {24,15,38,63,17}
    //delete element 38
    static int findElement(int arr[], int key, int n){
        for(int i = 0; i < n; i++){
            if (arr[i] == key){
                return i;
            }
        }
    return -1;
    } 

    static int deleteElement(int arr[], int key, int n){
        int pos = findElement(arr, key, n); //index of the element to be deleted

        if (pos == -1) {
            System.out.println("Element not present");    
            return n;        
        }

        for(int i = pos; i < n-1; i++){
            arr[i] = arr[i + 1];
        }
        return n - 1;
    }
    public static void main(String[] args) {
        int arr[] = {24,15,38,63,17};
        int n = arr.length;
        int key = 38;

        System.out.println("Before :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        //int index = findElement(arr, key, n);
        n = deleteElement(arr, key, n);

        System.out.println("\nAfter :");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
