import java.util.Scanner;

public class LinearSearch {
    static void add(int aa)
    {
        int a[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Elements in the array are:");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==aa)
            {
                System.out.println("element is present at " +i);
            }
        }
    }
    public static void main(String[] args) {
        add(5);
    }
}
