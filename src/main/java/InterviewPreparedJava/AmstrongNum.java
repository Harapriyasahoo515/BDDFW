package InterviewPreparedJava;

public class AmstrongNum {
    public static void main(StringPractice[] args) {
        isAmstrong(153);
    }

public static void isAmstrong(int num) {
    int r;
    int cube=0;
    int t;

   t=num;

    while(num>0){
        r = num%10;
        num = num/10;
       cube=cube+(r*r*r);
    }
    if (t==cube){
        System.out.println("Amstrong");
    }else
        System.out.println("Not Amstrong");
}


}
