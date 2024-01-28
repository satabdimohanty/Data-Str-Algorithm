public class ReverseNum {
    static void add(int a,int sum)
    {
        while (a>0) 
        {
            int digit=a%10;
            sum=sum*10+digit;
            a/=10;
           
            
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(1234, 0);
        add(456, 0);
        add(765490,0);
    }
}
