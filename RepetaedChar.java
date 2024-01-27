public class RepetaedChar {
    public static void main(String[] args) {
        String string="askask";
        char c[]=string.toCharArray();
        for(int i=0;i<string.length();i++)
        {
            int count=1;
            for(int j=i+1;j<string.length();j++)
            {
            if(c[i]==c[j]&&c[i]!=' ')
            {
                count++;
                c[j]='0';

            }
           
        }
        if(count>1&&c[i]!='0')
        {
            System.out.println(c[i]+"\t"+ count);
        }
        }
    }
}
