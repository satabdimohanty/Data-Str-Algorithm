public class StringPalindrome {
    static void add(String s, String r)
    
    {
        
        for(int i=s.length()-1;i>=0;i--)
        {
            r=r+s.charAt(i);

            
        }
        System.out.println(r);
        //logic to check palindrome or not
        if(r.equals(s))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palindrome");
        }

    }
    public static void main(String[] args) {
        String str = "abcdcbae";
        String r="";
        add(str, r);
    }
}
