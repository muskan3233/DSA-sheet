package Random_easy;

public class powOf2 {
    public boolean isPowerOfTwo(int n) {
        if(n<=0){
            return false;
        }else if(n==1){
            return true;
        }else{
            while (n%2==0){
                n = n/2;
            }
            if (n==1){
                return true;
            }
            else {
                return false;
            }
        }
    }
}
