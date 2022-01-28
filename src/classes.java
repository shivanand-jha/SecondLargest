public class classes {
    public static void main(String[] args) {
        circle c = new circle();
        circle c1 = new circle();
        c1.radius=7;
        c.radius=14;
        rectangle r = new rectangle();
        rectangle r1 = new rectangle();
        r1.length =6;
        r1.breadth=7;
        r.length=12;
        r.breadth=14;
        System.out.println(r.area());
        System.out.println(r1.area());
        System.out.println(c.area());
        System.out.println(c.perimeter());
        System.out.println(c1.area());
        System.out.println(c1.perimeter());
    }

}
class rectangle{
    public int length;
    public int breadth;
    public int area(){
     return length*breadth;
    }
}
class circle{
  public double radius;
  public double area(){
      return Math.PI*radius*radius;
  }
  public double perimeter(){
      return 2*Math.PI*radius;
  }
}