public class mysum {
    public static void main(String[] args) {
        double s =0;
        for (String x:args) {
            if (x.matches("[0-9.]+"))
            s = s+Double.parseDouble(x);
        }
        System.out.println( " the sum is :"+s);
    }
}