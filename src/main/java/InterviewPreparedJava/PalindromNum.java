package InterviewPreparedJava;

public class PalindromNum {
    public static void main(String[] args) {
        isPalindrom(1341);

    }
    public static void isPalindrom(int n){
       int r=0;
       int sum=0;
       int t;

       t=n;

        while(n!=0){
            r = n%10;
            sum=(sum*10)+r;
            n = n/10;

        }
        if(t==sum){
           System.out.println("Palindrom");
        }
        else
            System.out.println("Not Palindrom");
    }
}

