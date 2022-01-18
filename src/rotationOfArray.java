import java.util.Scanner;
import java.util.SortedMap;

public class rotationOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the  size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int temp=arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i-1]=arr[i];
        }
        arr[arr.length-1] = temp;
        for (int x:arr) {
            System.out.print(x+" ");
        }
    }
}
