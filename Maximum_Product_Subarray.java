import java.util.*;
class sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int res=a[0];
        for(int i=0;i<n;i++)
        {
            int m=a[i];
            for(int j=i+1;j<n;j++)
            {
                res=Math.max(m,res);
                m*=a[j];
            }
            res=Math.max(res,m);
        }
        System.out.println(res);
    }
}