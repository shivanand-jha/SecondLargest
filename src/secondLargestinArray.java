import java.util.Scanner;

public class secondLargestinArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max1,max2;
              max1=max2=arr[0];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max1){
                max2 = max1;
                max1 =arr[i];
            }
            else if (arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println("second largest is "+max2);
    }
}
