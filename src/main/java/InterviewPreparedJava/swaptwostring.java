package InterviewPreparedJava;

public class swaptwostring {
    public static void main(StringPractice[] args) {
        StringPractice a = "Hello";
        StringPractice b = "World";
        System.out.println("before swap "+a);
        System.out.println("before swap "+b);
        a=a+b;
        System.out.println(a);
        b=a.substring(0,a.length()-b.length());
        a=a.substring(b.length());
        System.out.println(a);
        System.out.println(b);

        System.out.println("after swap "+a);
        System.out.println("after swap "+b);
    }
}
