package InterviewPreparedJava;

public class StringPractice {
    public static void main(StringPractice[] args) {
        String s1="abc";
        String s2="pqr";
        //output-apbqcr

        StringBuilder s3=new StringBuilder();
        for (int i=0;i<s1.length();i++){
            s3.append(s1.charAt(i));
        s3.append(s2.charAt(i));}
        System.out.println(s3.toString());


    }
}
