public class dataHiding {
    public static void main(String[] args) {
        cl c = new cl();
        c.Setl(100);
        c.setb(200);
        c.getL();
        c.getB();
        System.out.println(c.getL());
        System.out.println(c.getB());
    }
}
class cl{
    private int l, b;
    int getL() {
        return l;
    }
    int Setl(int l1){
       return l=l1;
    }
    int setb(int b1){
        return b=b1;
    }
    int getB(){
        return b;
    }
}