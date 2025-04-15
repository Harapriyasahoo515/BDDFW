package InterviewPreparedJava;

import java.util.HashSet;

public class DuplicateinArray {
    public static void main(StringPractice[] args) {
        StringPractice[] arr ={"C","C","java","python","java"};

        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==(arr[j])){
                    System.out.println(arr[j]);
                }
            }
        }
        System.out.println("-----------");
        //Hashset
        HashSet<StringPractice> hs=new HashSet<StringPractice>();
        for(StringPractice s:arr){
            if(hs.add(s)==false){
                System.out.println(s);
            }
        }


    }
}
