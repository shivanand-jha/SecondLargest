import java.util.Scanner;

public class overloadedMethodForReversing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int n = sc.nextInt();
        System.out.println(reverse(n));
        int[]  c = {1,2,3,4,5};
        System.out.println(reverse(c));

    }
   static int reverse(int n)
   {
       int m,temp=0;
       while (n>0)
       {
           m = n%10;
            n /=10;
            temp = temp*10+m;
       }
       return temp;
   }
   static int[] reverse(int[] a)
   {
       int[] b = new  int[a.length];
       for (int i = a.length-1 , j=0; i >=0;  i--,j++)
           b[j]= a[i];
       return b;
   }
}
