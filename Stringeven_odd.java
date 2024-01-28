public class Stringeven_odd {
    static void add(String string)
    {
        System.out.println("even index are :");
        for(int i=0;i<string.length();i+=2)
        {
            System.out.println(string.charAt(i)+ "\t"+i);
        }
        System.out.println("odd index are : ");
        for(int j=1;j<string.length();j+=2)
        {
            System.out.println(string.charAt(j)+ "\t"+j);
        }
    }
    public static void main(String[] args) {
        String str = "Hello";
        add(str);
    }
}
