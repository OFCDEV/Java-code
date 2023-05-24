//With method overloading multiple methods can have same name with different parameters
public class MethodsOverLoading {
    static int plusMethod(int x, int y){
        return x+y;
        }
        static double plusMethod(double x, double y){
            return x+y;
        }
    public static void main(String[] args) {
        int myNum1 = plusMethod(21, 01);
        double myNum2 = plusMethod(9.3, .71);
        System.out.println(myNum1);
        System.out.println(myNum2);
    }
}
