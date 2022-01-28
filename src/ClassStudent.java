public class ClassStudent {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name="ram";
        s1.roll =1;
        s1.SuCode=1;
        s1.Subject="cse java";
        System.out.println(s1.studentDetail());
    }
}
class student {
  public   int roll;
    public int SuCode;
    public  String name;
    public String Subject;
   public String studentDetail(){
    return roll+" \n"+name+" \n"+SuCode+"\n"+Subject;
    }
}