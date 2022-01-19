//From the given set of values in the array, the children inside the array is the element
// which is the smallest among all the elements present in the right of it and the rightmost element is always a child.
//        Input Format
//        An integer n, denoting number of elements An array of size n;

import java.util.Scanner;

public class childSort {
    public static void main(String[] args )  {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of array");
        int n = sc.nextInt();
        System.out.println("element of array ");
        int[] arr = new int[n];
        for(int i =0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i =0; i<n; i++)
        {
            int j;
            for(j=i+1; j<n; j++)
            {
                if(arr[i]>=arr[j])
                {
                    break;
                }
            }
            if(j==n)
                System.out.print(arr[i]+" ");

        }

    }
}
