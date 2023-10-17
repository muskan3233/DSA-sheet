public class reverseArray {
    static void reversearr(int arr[], int start, int end){
        int temp;
        while(start<end){
            temp = arr[start];
            arr[start] = arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }

    static void printarr(int arr[]){
        for(int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String args[]){
        int arr[]={33,66,44,88,77,99};
        printarr(arr);
        reversearr(arr,0,5);
        System.out.print("Reversed Array: ");
        printarr(arr);
    }
}

// we can solve this method by recursion
// static void rvereseArray(int arr[], int start, int end) 
//     { 
//         int temp; 
//         if (start >= end) 
//             return; 
//         temp = arr[start]; 
//         arr[start] = arr[end]; 
//         arr[end] = temp; 
//         rvereseArray(arr, start+1, end-1); 
//     } 