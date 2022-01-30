import java.util.Scanner;

//You are given an integer , you have to convert it into a string.
//
//        Please complete the partially completed code in the editor. If your code successfully converts  into a string  the code will print "Good job". Otherwise it will print "Wrong answer".
//
//        can range between 100  to  1000 inclusive.
public class intToString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        String s =""+n;
        System.out.println("Good job "+s);
    }
}
