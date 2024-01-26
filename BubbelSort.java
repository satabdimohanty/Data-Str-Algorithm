import java.util.Arrays;

public class BubbelSort {
    static void add(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                int n=a[i];
                a[i]=a[j];
                a[j]=n;
                }
            }
        }
        System.out.println("1st large element is : "+a[a.length-1]);
        System.out.println("2nd large element is : "+a[a.length-2]);
        System.out.println("3rd large element is : "+a[a.length-3]);

    }
    public static void main(String[] args) {
        int arr[] ={34,1,0,64, 25, 12};
        add(arr);
    }
    
}
