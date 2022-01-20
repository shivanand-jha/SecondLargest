import java.util.Scanner;

public class copyOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("size of an array");
        int n = sc.nextInt();
        System.out.println("enter the element ");
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            arr1[i] = arr[i];
        }
        for (int x :arr1) {
            System.out.print(x+" ");
        }
    }
}
