public class methodMaxInArray {
    static int max(int[] a)
    {
        int max=0;
        for (int j : a)
            if (j > max) {
                max = j;
            }
        return  max;
    }

    public static void main(String[] args) {
        int[] a = {1,2,2,3,3,45,5};
        System.out.println(max(a));
    }

}
