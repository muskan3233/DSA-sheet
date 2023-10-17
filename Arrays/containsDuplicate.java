import java.util.*;


public class containsDuplicate {
    static boolean containdup(int[] arr){
        Arrays.sort(arr);
        for (int i=0; i<arr.length-1; i++ ){
            if(arr[i]==arr[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]){
        int arr[]={22,66,55,44,77};
        boolean hasDuplicate =containdup(arr);
        if(hasDuplicate){
            System.out.println("Array contains Duplicates");
        }
        else {
            System.out.println("Array doesn't contains Duplicates");
        }
    }
}
