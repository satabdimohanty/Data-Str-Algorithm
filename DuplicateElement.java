public class DuplicateElement {
    public static void main(String[] args) {
            int  count;
            int arr[] = {1, 1, 3, 1, 2};
        
        for(int i=0;i<arr.length;i++)
        {
            count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    arr[j]=0;
                }
            }
            if(count>1 &&arr[i]!=0)
            {
                System.out.println("duplicate elemnts are : "+ arr[i]+" repeated "+count+" times.");
            }
        }
    }
}
