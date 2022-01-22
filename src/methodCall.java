public class methodCall {

//      static   int max(int x , int y)//method creation
//        {
//          if(x>y)
//              return x;
//          else
//              return y;
//        }
    //without making a method static we can use the method by creating  a OBJECT of that class and
    //call that method by using object of that class .
    // but its ot a god practice to se the object for using a method
    int max(int x,int y)
    {
        if(x>y)
              return x;
          else
              return y;
    }

static  void in(int x){
    x++;//change in formal parameter
    System.out.println(x);
}
    public static void main(String[] args) {
        int a=10 ,b=15 ;//actual parameter
        System.out.println(a);
        in(a);
        methodCall m = new methodCall();
        System.out.println(m.max(a,b));//use of mthod without making static
    }
}
