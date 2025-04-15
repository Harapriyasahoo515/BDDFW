package InterviewPreparedJava;

public class MissingNoinArray {
    public static void main(StringPractice[] args) {

        int a[]={1,2,3,5};
        int sum=0;
        for (int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        int sum1=0;
        for (int j=0;j<=5;j++){
            sum1=sum1+j;
        }

        System.out.println("Missing number= "+(sum1-sum));



    }




}
