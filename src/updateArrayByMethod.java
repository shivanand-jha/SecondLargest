public class updateArrayByMethod {
     static void change(int a[],int index , int value)
    {
        a[index]=value;
    }

    public static void main(String[] args) {
        int[] a = {2,3,4,5,6};
        change(a,2,20);
        for (int x :a) {
            System.out.print(x+" ");
        }
    }
}
