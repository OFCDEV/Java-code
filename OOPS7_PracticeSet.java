//Q1
class cylinder{
    private int radius;

    public int getRadius(){
        return radius;
    }
    public void setRadius(int r){
        radius = r;

    }
    public double surfaceArea(){
        return 2*3.14*radius*radius;
        }
public class OOPS7_PracticeSet {
   
       
    }
    public static void main(String[] args) {
        cylinder myCilinder = new cylinder();
        myCilinder.setRadius(21);
        int n = myCilinder.getRadius();
        System.out.println(n);
        System.out.println(myCilinder.surfaceArea());
    }
   
}
