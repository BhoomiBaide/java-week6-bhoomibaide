package homeworkweek6;

public class Programme_3 {
    int a = 10;// a is Instance variable
    static int b = 20;// b is Static variable

    // m1 is Instance method
    public  void m1(){
        System.out.println("The value of a is" + a + "and the value of b is" + b );
    }
    // m2  is Static method
    public static void m2(){
        Programme_3 obj = new Programme_3();
        System.out.println("The value of a is" + obj.a + " and the value of b is " + b);
    }

    public static void main(String[] args) {
        Programme_3 obj = new Programme_3();
        obj.m1();
        m2();
    }
}
