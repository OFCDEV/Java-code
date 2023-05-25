//Q1
class Employee3{
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}
class CellPhone{
    public void ringing(){
        System.out.println("Ringing..");
    }
    public void vibrating(){
        System.out.println("Vibrating");
    }
}
class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class OOPS4_BasicQuestion {
    public static void main(String[] args) {
        //problem-1
        Employee3 dev = new Employee3();
        dev.setName("HyeDev");
        dev.salary = 233;
        System.out.println(dev.getSalary());
        System.out.println(dev.getName());
        //prob-2
        CellPhone Vivo = new CellPhone();
        Vivo.ringing();
        Vivo.vibrating();
        //Prob-3
        Square s1 = new Square();
        s1.side = 21;
        System.out.println(s1.area());
        System.out.println(s1.perimeter());
    }
}
