//Passing multiple parameters
public class Methods3parameters_Argu2 {
    static void myMethod(String fname, int age){
        System.out.println("The age of"+ fname+ "is" + age);
    }
    public static void main(String[] args) {
        myMethod("x1", 69);
        myMethod("y1", 99);
    }
}
