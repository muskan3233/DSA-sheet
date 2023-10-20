// // 1st approach using sorting
// import java.util.*;
// import java.io.*;

// class Pair{
//     public int min;
//     public int max;
// }

// public class GetMinMax{
//     static Pair getMinMax(int arr[]){
//         Pair minmax = new Pair();
//         Arrays.sort(arr);
//         minmax.min = arr[0];
//         minmax.max = arr[arr.length-1];
//         return minmax;
//     }

//     public static void main(String args[]){
//         int arr[] = {11,43,55,656,76,555};
//         int arr_size = arr.length;
//         Pair minmax = getMinMax(arr);
//         System.out.println("Minimum element: "+minmax.min);
//         System.out.println("Maximum Element: "+minmax.max);
//     }
// }

// using linear search

public class GetMinMax{
    static class Pair{
        int min;
        int max;
    }

    static Pair getMinMax(int arr[]){
        Pair minmax = new Pair();
        int i;
        if(arr.length == 1){
            minmax.min=arr[0];
            minmax.max=arr[arr.length-1];
            return minmax;
        }
        if (arr[0]>arr[1]){
            minmax.min=arr[1];
            minmax.max=arr[0];
        }else{
            minmax.min=arr[1];
            minmax.max=arr[0];
        }

        for(i=2; i<arr.length; i++){
            if(arr[i]>minmax.min){
                minmax.max=arr[i];
            }
            else if(arr[i]<minmax.max){
                minmax.min=arr[i];
            }
        }

        return minmax;
    }

    public static void main(String args[]){
        int arr[]={23,55,1,666,7778,99999};
        Pair minmax = getMinMax(arr);
        System.out.println("Minimum Element is "+minmax.min);
        System.out.println("Maximum Element is "+minmax.max);
    }
}

