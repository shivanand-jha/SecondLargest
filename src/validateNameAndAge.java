public class validateNameAndAge {
  static Boolean validate ( String Name)
    {
        return Name.matches("[a-zA-Z\\s]+");
    }
   static Boolean validate( int age){
       return age>=3 && age<=15;
    }

    public static void main(String[] args) {
        System.out.println(validate("shiva"));
        System.out.println(validate(12));
    }
}
