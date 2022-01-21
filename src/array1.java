import java.util.Scanner;

public class array1 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element of matrix A");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the element of B");
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Result is : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                c[i][j] = a[i][j] * b[i][j];
            }
        }
        for (int[] x : c) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}