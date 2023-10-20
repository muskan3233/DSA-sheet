package Random_easy;

public class fibonnaciSeries{
    static int fibser(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int firstTerm = 0;
        int secondTerm = 1;

        for(int i=0; i<=n; i++){
            int thirdTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = thirdTerm;
        }

        return firstTerm;
    }

    public static void main(String args[]){
        int n=45;
        int febNo = fibser(n);
        System.out.println(febNo);
    }
}