public class overloadedMethodForArea {
    static float area(float a, float b){
        return a*b;
    }
    static  double  area(double r)
    {
        return (Math.PI*r*r);
    }
    static int area(int a,int b ,int c){
        return a*b*c;
    }

    public static void main(String[] args) {
        System.out.println("area is "+area(10));
        System.out.println("area is "+area(10,12));
        System.out.println("area is "+area(10,12,13));
    }
}
