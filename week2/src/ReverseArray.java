public class ReverseArray {
    public static void main(String args[]) {
        int []a = new int[]{2,3,1,7,10,4,5,6};
        int i,temp,j;
        int n = a.length;
        j=n-1;
        System.out.println("Given array");
        for(i=0;i<n;i++)
            System.out.printf(a[i]+" ");
        for(i=0;i<n/2;i++,j--) {
            temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }
        System.out.println("\nReverse array");
        for(i=0;i<n;i++)
            System.out.printf(a[i]+" ");
    }
}
