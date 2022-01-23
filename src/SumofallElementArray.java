public class SumofallElementArray {
    static double sum (double ...x)
    {
        double s =0;
        for (double v : x) {
            s += v;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum());
        System.out.println(sum(120.2,12.2));
        System.out.println(sum(10,12,45,78,125));
    }
}
