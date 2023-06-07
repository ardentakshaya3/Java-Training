import java.util.*;

class FindArray
{
    public static void main(String args[])
    {
        int l,s,i;
        int a[] = new int[]{8, 2, 3, 4, 5, 10, 9, 3, 6};
        int n = a.length;
        l=s=a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]>l)
                l=a[i];
            if(a[i]<s)
                s=a[i];
        }
        System.out.println("Given array: ");
        for(i=0;i<n;i++)
            System.out.printf(a[i]+" ");
        System.out.println("\nThe smallest element is " + s );
        System.out.print("The largest element is " + l );
    }
}