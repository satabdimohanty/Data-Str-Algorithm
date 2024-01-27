public class Repeatedwords {
    public static void main(String[] args) {
        String str = "big black big black";
        String string[]=str.split(" ");
        for(int i=0;i<string.length;i++)
        {
            int counter=1;
            for(int j=i+1;j<string.length;j++)
            {
                if(string[i].equals(string[j])&&string[i]!=" ")
                {
                    counter++;
                    string[j]="0";


                }
            }
            if(counter>1&&string[i]!="0")
            {
                System.out.println(string[i]+"\t"+counter);
            }
        }
    }
}
