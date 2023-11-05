import java.util.*;

public class Ques_2 {
    public static void miniMaxSum(List<Integer> arr){
        Collections.sort(arr);
        long min = 0;
        long max = 0;
        for (int i=0, j=arr.size()-1; i<arr.size()-1; i++, i--){
            min+=arr.get(i);
            max+=arr.get(j);
        }
        System.out.print(min+ " "+ max);
    }
}
