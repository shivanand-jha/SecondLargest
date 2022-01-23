public class overloadedMethodForReversing {
    public static void main(String[] args) {
        System.out.println(reverse(145));
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
}
