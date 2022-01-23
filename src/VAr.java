public class VAr {
    static int max (int ...a)
    {
        if (a.length==0)return Integer.MIN_VALUE;
        int m=a[0];
        for (int j : a) {
            if (j > m) {
                m = j;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println(max(125));
        System.out.println(max(1,2,5,45));
        System.out.println(max(0,125,1254));
    }
}
