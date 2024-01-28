import java.util.Arrays;

public class StringBubbleSort {
    static void add(String string)
    {
        char  c[]=string.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]>c[j])
                {
                char n=c[i];
                c[i]=c[j];
                c[j]=n;
                }
            }
           
           
        }
        System.out.println(Arrays.toString(c));
        
        
    }
    public static void main(String[] args) {
        String  str="SATABDI";
        add(str);
    }
}
