package InterviewPreparedJava;

public class DuplicateWord {
    public static void main(String[] args) {
        String s="Big black bug bit a big black dog on his big black nose";
        int count;

        s=s.toLowerCase();
        String[] word = s.split(" ");

        for(int i=0;i<word.length;i++)
        {
            count=1;
            for (int j=i+1;j<word.length;j++)
                if(word[i].contains(word[j])){
                    count++;
                    word[j]="0";//Set words[j] to 0 to avoid printing visited word
                }
            if(count>1 && word[i]!="0"){
                System.out.println(word[i]);
            }


        }
    }
}
