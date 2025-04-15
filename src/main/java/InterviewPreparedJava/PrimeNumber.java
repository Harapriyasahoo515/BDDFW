package InterviewPreparedJava;

public class PrimeNumber {
    public static void main(String[] args) {
        int n=2;
//        int count=0;
//        for (int i=1;i<=n;i++){
//            if(n%i==0){
//                count++;
//            }
//        }
//        if(count==2){
//            System.out.println("Prime Number");
//        }else System.out.println("Not Prime Number");
//        System.out.println("---------------");

        System.out.println(isprime(5));
    }
public static boolean isprime(int n){

        if(n<=1)
            return false;
        for(int i=2;i<n;i++){
            if (n%i==0)
                return false;
        }
        return true;
}

    }

