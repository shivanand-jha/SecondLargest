public class variableArgument {
    /*
    show();
    from zero to n number of argument.
     */
   static void show(int... x)//work for both variable argument and array argument
    {
        for (int a :x) {
            System.out.println(a);
        }

    }
   static void shows(int a , int ...b)
    {
        for (int j : b) {
            System.out.println(a+" "+j);
        }
    }

    public static void main(String[] args) {
        show(1,2,3);
        shows(5 ,4,5,6);
    }
}
