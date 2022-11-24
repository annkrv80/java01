class Program
{
  public static void main(String[] args) {
      short age = 10;
      int salary = 123456;
      System.out.println(age);        //10
      System.out.println(salary);     //1
      float e = 2.7f;
      double pi = 3.1415;
      System.out.println(e);        // 2.7
      System.out.println(pi); 
      char ch = '1';
      System.out.println(Character.isDigit(ch));  // true
      ch = 'a';
      System.out.println(Character.isDigit(ch));  // false
      boolean flag1 = 123 <= 234;
      System.out.println(flag1);  // true
      boolean flag2 = 123 >= 234 || flag1;
      System.out.println(flag2);  // true
      boolean flag3 = flag1 ^ flag2;
      System.out.println(flag3);  // false

  }
  
}