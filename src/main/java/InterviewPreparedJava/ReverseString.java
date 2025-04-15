package InterviewPreparedJava;

public class ReverseString {
    public static void main(StringPractice[] args) {
        StringPractice s1="Harapriya";
        StringPractice s2=" ";
        for (int i=s1.length()-1;i>=0;i--){
            s2=s2+s1.charAt(i);

        }
        System.out.println(s2);

        StringBuffer sb=new StringBuffer(s1);
        StringBuffer s3 = sb.reverse();
        System.out.println(s3);
    }
}
