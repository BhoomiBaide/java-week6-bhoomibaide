package homeworkweek6;

public class Programme_4 {
    // x and y is Instance variables
    int x = 10;
    int y = 20;
    // z and w is Static varibles
    static int z = 100;
    static int w = 200;
     //This is Instance Method
    public void myMethod(){
        System.out.println("The value of x is " + x + ", the value of y is " + y + ", the value of z is " + z + ", and the value of w is " + w);
    }
    //This is Static Method
    public static void myStaticMethod(){
        Programme_4 obj = new Programme_4();
        System.out.println("The value of x is " + obj.x + ", the value of y is " + obj.y + ", the value of z is " + z +", and the value of w is " +w);
    }

    public static void main(String[] args) {
        Programme_4 obj = new Programme_4();
        myStaticMethod();
    }
}
