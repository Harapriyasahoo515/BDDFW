package InterviewPreparedJava;

public class Removespecialcharcater {
    public static void main(StringPractice[] args) {


        StringPractice s="*^%$%^hello World(*&^&*(9887)(*^&*";
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);

    }
}
