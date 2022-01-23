public class methodOverloading {
    static int max(int a ,int b)
    {
        return a>b?a:b;
    }

    public static void main(String[] args) {
        System.out.println(max(10,15));
        System.out.println(max(10.2f,10.5f));
        System.out.println(max(12,15,10));
    }//overloading method max with diff data type
    static float max(float a, float b){
        return a>b?a:b;
    }
    // overloaded method max with diff parameter
     static  int max(int a,int b, int c ) {
         if (a > b && a > c)
             return a;
         else if (b > a && b > c)
             return b;
         else
             return c;
     }

}
