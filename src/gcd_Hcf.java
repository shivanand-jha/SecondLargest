public class gcd_Hcf {
    public static void main(String[] args) {
        System.out.println(hcf(25,15)+" is the highest common factor of given numbers ");
    }
    static int hcf(int m,int n)
    {
        while( m!=n){
            if (m>n) m= m-n;
            else n = n-m;
        }
        return m;
    }
}
