package InterviewPreparedJava;

import java.util.Arrays;

public class Large_smallNumArray {
    public static void main(String[] args) {
        int num[]={-4,26,8,78446,-9};

        int largest=num[0];
        int smallest=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>largest){
                largest=num[i];
            }else if(num[i]<smallest){
                smallest=num[i];
            }
        }
        System.out.println("numbers:"+ Arrays.toString(num));
        System.out.println("largest:"+ largest);
        System.out.println("smallest:"+ smallest);
    }
}
