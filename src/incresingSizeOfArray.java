public class incresingSizeOfArray {
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5,6,7,8};
      int[] b = new int[2*arr.length];
        System.arraycopy(arr, 0, b, 0, arr.length);
        arr = b;
        for (int x : b) {
            System.out.print(x+",");
        } System.out.println(arr.length);
    }
}
