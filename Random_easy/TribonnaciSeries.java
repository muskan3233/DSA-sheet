package Random_easy;

public class TribonnaciSeries{
    static int tribonacci(int n) {
        if (n==0){
            return 0;
        }
        else if(n==1 || n==2){
            return 1;
        }
        else{
            int firstTerm = 0;
            int secondTerm = 1;
            int thirdTerm = 1;

            for(int i=1; i<=n; i++){
                int fourthTerm = firstTerm + secondTerm + thirdTerm;
                firstTerm = secondTerm;
                secondTerm = thirdTerm;
                thirdTerm = fourthTerm;
            }
        
        return firstTerm;
        }
    }

    public static void main(String args[]){
        int n=45;
        int triNo = tribonacci(n);
        System.out.println(triNo);
    }
}