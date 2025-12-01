import java.util.*;
public class secondLargest 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0; i<n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        int lar=Integer.MIN_VALUE;
        int sec_lar=Integer.MIN_VALUE;//second largest
        if(n>2)
        {
            for(int x=0;x<n;x++)
            {
                if(lar<arr[x])
                {
                    lar=arr[x];
                }
            }
            for(int x=0;x<n;x++)
            {
                if(sec_lar<arr[x] && arr[x]<lar)
                {
                    sec_lar=arr[x];
                }
            }
            System.out.println("The second largest element in the given array is "+sec_lar);
        }
        else
        {
            System.out.println(-1);
        }
    }
}
