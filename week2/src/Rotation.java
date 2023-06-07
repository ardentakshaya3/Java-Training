import java.io.*;

class Rotation {

    static void Rotation(int a[], int r, int n)
    {
        int []temp = new int[n];
        int k = 0;
        for (int i = r; i < n; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < r; i++) {
            temp[k] = a[i];
            k++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }

    public static void main (String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6, 7 };
        int n = a.length;
        int r = 3;

        Rotation(a, r, n);
    }
}