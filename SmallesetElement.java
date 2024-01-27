public class SmallesetElement {
public static void main(String[] args) {
    int a[]={23,1,2,5}; int small=a[1],secsmall=a[2];
    for(int i=0;i<a.length;i++)
    {
        if(a[i]<small)
        {
            small=a[i];
        }
        else if(a[i]<secsmall&&a[i]>small)
        {
            secsmall=a[i];

        }
        
    }
    System.out.println(small+"\t"+secsmall);
}
}
