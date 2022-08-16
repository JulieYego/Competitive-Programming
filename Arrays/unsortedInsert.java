package Arrays;
//Time complexity - O(1)
//Space complexity - O(1)

public class unsortedInsert {
    static int insert(int arr[], int n, int value, int capacity){
        //capacity is max number of elements an array can store
        //n is the current number of elements
        if (n >= capacity){
            return n;
        }

        arr[n] = value;
        return (n + 1);
    }     

    public static void main(String[] args) {
        int arr[] = new int[20];
        arr[0] = 24;
        arr[1] = 22;
        arr[2] = 6;
        arr[3] = 19;
        arr[4] = 4;
        arr[5] = 25;
        int capacity = 20;
        int n = 6;
        int value = 1;
        
        System.out.println("Array before Insertion: ");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }

        n = insert(arr, n, value, capacity);
        System.out.println(n);

        System.out.println("Array after Insertion: ");
        for (int i = 0; i < n; i++){
            System.out.println(arr[i] + " ");
        }
    }
}
