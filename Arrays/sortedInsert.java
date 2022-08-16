package Arrays;
//Time complexity - O(n)
//Space complexity - O(1)
public class sortedInsert {
    static int insertElement(int arr[], int n, int capacity, int key){
        //check if array can accept more elements
        if (n >= capacity) {
            return -1;
        }

        int i;
        for(i = n - 1; (i >= 0 && arr[i] > key); i-- ){
            arr[i + 1] = arr[i]; //shift elements one step to the right
        }

        arr[i + 1] = key;
        
        return (n + 1);
    }    

    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 12;
        arr[1] = 23;
        arr[2] = 38;
        arr[3] = 43;
        arr[4] = 57;
        arr[5] = 64;
        
        int capacity = arr.length;
        int n = 6;
        int key = 41;

        System.out.println("Before : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        n = insertElement(arr, n, capacity, key);

        System.out.println("\nAfter : ");
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
