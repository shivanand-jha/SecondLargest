import java.util.Scanner;

public class insertionInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the  size of an Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter elements of array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println(" ");
        System.out.println(" enter the no. to be inserted");
        int x = sc.nextInt();
        System.out.println("enter the index where the element is going to inserted");
        int index=sc.nextInt();
        for (int i = n; i >index; i++) {
            arr[i] =arr[i-1];
            arr[index] = x;
            System.out.println(arr[i]);
        }
    }
}
