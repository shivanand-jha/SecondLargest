import java.util.Scanner;
//There are N students in a classroom , and  they are seated in a linear order.
// The teacher plans to change the seating arrangement of all the students in such a way that each student sits on the new bench everyday.
// For example, student sitting at first bench moves to the second bench
public class changeInarrangement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of array");
        int n = sc.nextInt();
        System.out.println("Enter string element in array");
        String[] arr = new String[n];
        for(int i =0; i<n; i++)
        {
            arr[i] =sc.next();
        }
        String x =arr[arr.length-1];
        for(int i=n-1; i>0;i--){
            arr[i]= arr[i-1];
        }arr[0]=x;
        for(int r=0;r<n;r++){
            System.out.print(arr[r]+" ");
        }

    }
}
