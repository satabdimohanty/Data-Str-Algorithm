import java.util.regex.Pattern;

public class StringSplit {
    static void add(String string,String r)
    {
        
        
         String splString[]=string.split(" ");
            for(int i=splString.length-1;i>=0;i--)
            {
            r=r+" "+splString[i];

            }
            System.out.println(r);
    }
    public static void main(String[] args) {
        String s="This is a test string";
        String ss="hello satabdi";
        String r="";
        add(s, r);
        add(ss, r);
    }
}
